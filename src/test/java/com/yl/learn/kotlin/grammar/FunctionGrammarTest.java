package com.yl.learn.kotlin.grammar;

import junit.framework.TestCase;

public class FunctionGrammarTest extends TestCase {

    FunctionGrammar functionGrammar = new FunctionGrammar();

    public void testSum() {
        functionGrammar.sum(1, 3);
    }

    public void testSumOriginal() {
        functionGrammar.sumOriginal(1.0, 2);
    }


    public void testPrint() {
        FunctionGrammar[] functionGrammars = new FunctionGrammar[1];
        functionGrammars[0] = functionGrammar;

        functionGrammar.print(functionGrammars);
    }
}
