package com.yl.learn.kotlin.grammar;

import junit.framework.TestCase;

public class JudgementGrammarTest extends TestCase {

    private static JudgementGrammar judgementGrammar = new JudgementGrammar();

    private static CollectionGrammar collectionGrammar = new CollectionGrammar();

    public void testIf() {
        judgementGrammar.isZero(22);
    }

    public void testAnd() {
        judgementGrammar.isEmpty(collectionGrammar.array());
    }
}
