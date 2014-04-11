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
import com.pixelmaid.dresscode.drawing.primitive2d.Drawable;
import com.pixelmaid.dresscode.events.CustomEvent;
import com.pixelmaid.dresscode.events.CustomEventListener;

public class DrawableRepeatStatementNode extends DCNode {

	private String numId;
	private String groupId;
	private DCNode numExpr;
	private BlockNode block;
	protected Scope scope;



	public DrawableRepeatStatementNode(String gId, String nId, DCNode n,  DCNode bl, Scope s, int l, int c) {
		groupId = gId;
		numId= nId;
		numExpr=n;
		block = (BlockNode)bl;
		scope = s;
		line = l;
		col=c;
		//block.addEventListener(drawableManager);

		//System.out.println("lookup for repeat node ="+l);
	}



	@Override
	public VarType evaluate() {
		double start = 0;
		double stop = numExpr.evaluate().asDouble();
		double increment = 1.0;
		Drawable group = scope.resolve(groupId).asDrawable();
		for(double i = start; i < stop; i+=increment) {
			scope.assign(numId, new VarType(i));
			DrawableManager drawableManager= new DrawableManager();
			DrawableManager master = (DrawableManager)block.getListenerAt(0);
			master.addEventListener(drawableManager);
			System.out.println("setting group line to = "+block.getStatementAt(0).getLine());

			block.evaluate();

			ArrayList<Drawable> d = drawableManager.getDrawables();
			System.out.println("num of drawables from block="+d.size());
			Drawable g=null;
			if(d.size()>0){
				if(d.size()>1){
					g= new Drawable();
					for(int j=d.size()-1;j>=0;j--){
						g.addToGroup(d.get(j),0);
						this.fireDrawableEvent(CustomEvent.REMOVE_DRAWABLE,d.get(j));

						System.out.println("adding to group at="+j);
					}
					this.fireDrawableEvent(CustomEvent.DRAWABLE_CREATED,g);

				}
				else if(d.size()==1){
					System.out.println("only 1 drawable in block");
					g = d.get(0);
				}
				drawableManager.clearAllDrawables();
				group.addToGroup(g);
				
			}
			master.removeEventListener(drawableManager);
			group.setLine(block.getStatementAt(block.getNumStatements()-1).getLine());
			System.out.println("setting group line to"+block.getStatementAt(block.getNumStatements()-1).getLine());
			group.setLastTransform(TransformTypes.NONE, block.getStatementAt(block.getNumStatements()-1).getLine(),0,0,0);

		}


		return new VarType(group);

	}

}
