package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.events.CustomEvent;

import java.io.PrintStream;

public class PrintNode extends NodeEvent implements DCNode {

    private DCNode expression;
    private PrintStream out;

    public PrintNode(DCNode e) {
        this(e, System.out);
    }

    public PrintNode(DCNode e, PrintStream o) {
        expression = e;
        out = o;
    }

    @Override
    public VarType evaluate() {
        VarType value = expression.evaluate();
        out.print(value == VarType.NULL ? "" : value);
        this.printEvent(CustomEvent.PRINT_STATEMENT, value.asString());
       // Window.output.setText(Window.output.getText()+value.toString());
        return VarType.VOID;
    }
}
