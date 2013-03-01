package com.pixelmaid.dresscode.antlr.types.tree.functions;

import com.pixelmaid.dresscode.antlr.types.VarType;
import com.pixelmaid.dresscode.antlr.types.tree.DCNode;
import com.pixelmaid.dresscode.app.Window;

import java.io.PrintStream;

public class PrintNode implements DCNode {

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
        Window.output.setText(Window.output.getText()+value.toString());
        return VarType.VOID;
    }
}
