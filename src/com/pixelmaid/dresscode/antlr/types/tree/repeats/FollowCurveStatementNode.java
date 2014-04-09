package com.pixelmaid.dresscode.antlr.types.tree.repeats;

import java.util.ArrayList;

import com.pixelmaid.dresscode.antlr.types.Scope;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.BlockNode;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.antlr.types.tree.PatternBlockNode;
import com.pixelmaid.dresscode.antlr.types.tree.functions.transforms.TransformTypes;
import com.pixelmaid.dresscode.data.DrawableManager;
import com.pixelmaid.dresscode.drawing.datatype.Point;
import com.pixelmaid.dresscode.drawing.math.Pattern;
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;

public class FollowCurveStatementNode extends DCNode {

	private String numId;
	private String groupId;
	private DCNode curveExpr;
	private DCNode numExpr;
	private BlockNode block;
	protected Scope scope;
	private boolean lookup;


	public FollowCurveStatementNode(String gId, DCNode cur, String nId, DCNode n, DCNode bl, Scope s, int l, int c) {
		groupId = gId;
		numId= nId;
		numExpr=n;
		curveExpr = cur;
		block = (BlockNode)bl;
		scope = s;
		line = l;
		col=c;
		//block.addEventListener(drawableManager);

		//System.out.println("lookup for repeat node ="+l);
	}



	@Override
	public VarType evaluate() {

		int start = 0;
		int stop = (int)Math.round(numExpr.evaluate().asDouble());
		int increment = 1;
		Drawable curves = curveExpr.evaluate().asDrawable();
		Drawable group = scope.resolve(groupId).asDrawable();
		ArrayList<Point> curvePoints= Pattern.curvesToPoints(curves, stop);

		for(int i = start; i < stop; i+=increment) {

			scope.assign(numId, new VarType(i));
			DrawableManager drawableManager= new DrawableManager();
			DrawableManager master = (DrawableManager)block.getListenerAt(0);
			master.addEventListener(drawableManager);
			block.evaluate();

			ArrayList<Drawable> d = drawableManager.getDrawables();
			//System.out.println("num of drawables from block="+d.size());
			if(i<curvePoints.size()){
				Drawable g=null;
				if(d.size()>0){
					if(d.size()>1){
						g= new Drawable();
						for(int j=d.size()-1;j>=0;j--){
							g.addToGroup(d.get(j),0);
							this.fireDrawableEvent(CustomEvent.REMOVE_DRAWABLE,d.get(j));

							//System.out.println("adding to group at="+j);
						}
						this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED,g);

					}
					else if(d.size()==1){
						//System.out.println("only 1 drawable in block");
						g = d.get(0);
					}
					drawableManager.clearAllDrawables();
					//double theta = 360/stop*i;

					g.moveTo(curvePoints.get(i).getX(), curvePoints.get(i).getY());
					group.addToGroup(g);

				}
			}

			master.removeEventListener(drawableManager);
			group.setLine(block.getStatementAt(block.getNumStatements()-1).getLine());
			group.setLastTransform(TransformTypes.NONE, block.getStatementAt(block.getNumStatements()-1).getLine(), 0);

		}


		return new VarType(group);

	}

}