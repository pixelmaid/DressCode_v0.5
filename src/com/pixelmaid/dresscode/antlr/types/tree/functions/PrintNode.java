package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.antlr.types.tree.NodeEvent;
import com.pixelmaid.dresscode.events.CustomEvent;

import java.io.PrintStream;

public class PrintNode extends DCNode {

    private DCNode expression;
    private PrintStream out;

    public PrintNode(DCNode e, int l, int c) {
        this(e, System.out, l,c);
    }

    public PrintNode(DCNode e, PrintStream o, int l, int c) {
        expression = e;
        out = o;
        line = l;
        col=c;
    }

    @Override
    public VarType evaluate() {
        VarType value = expression.evaluate();
        out.print(value == VarType.NULL ? "" : value);
        this.firePrintEvent(CustomEvent.PRINT_STATEMENT, value.toString());
       // Window.output.setText(Window.output.getText()+value.toString());
        return VarType.VOID;
    }
}
