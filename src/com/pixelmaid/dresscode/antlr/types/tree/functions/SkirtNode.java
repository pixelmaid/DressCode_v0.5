package com.pixelmaid.dresscode.antlr.types.tree.functions;


import java.util.List;
import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.drawing.primitive2d.Skirt;
import com.pixelmaid.dresscode.events.CustomEvent;

public class SkirtNode extends DrawableNode implements DCNode {

    public SkirtNode(List<DCNode> ps, int l) {
        super(ps,l);

    }

    @Override
    public VarType evaluate() {
        //Skirt takes in no constructors at the moment.
        Skirt e = new Skirt();

        try{
            //TODO evaluate the inputs of Skirt to adjust size of board. 
            /*
            if(params.get(0).evaluate().isString()){
                String path = params.get(0).evaluate().asString();
                //e.setPath(path);
                //e.loadShape();
                
                if(params.size()>1){
                    if(params.size()==3 && params.get(1).evaluate().isNumber()&& params.get(2).evaluate().isNumber()){
                        
                        e.moveTo(params.get(1).evaluate().asDouble(),params.get(2).evaluate().asDouble());
                    }
                }
            
            }
            else{
                //Window.output.setText("incorrect parameters for Skirt call at line:"+line);

                System.err.println("incorrect arguments for Skirt at line:"+line);
            }
            */


            this.drawableEvent(CustomEvent.DRAWABLE_CREATED, e);
            this.drawableEvent(CustomEvent.SHAPE_LOAD_REQUESTED, e);
        }
        catch (ClassCastException err){
            //Window.output.setText("incorrect parameters for Skirt call at line:"+line);

            System.err.println("inccorect arguments for Skirt at line:"+line);
        }
        return new VarType(e);  
        //throw new RuntimeException("Illegal function call: " + this);
    }


}
