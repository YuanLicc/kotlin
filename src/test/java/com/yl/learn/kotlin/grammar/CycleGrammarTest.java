package com.yl.learn.kotlin.grammar;

import junit.framework.TestCase;

public class CycleGrammarTest extends TestCase {

    private static CycleGrammar cycleGrammar = new CycleGrammar();

    private static CollectionGrammar collectionGrammar = new CollectionGrammar();

    public void testFor() {
        cycleGrammar.forCycle(collectionGrammar.array());
    }

    public void testForArrayInit() {
        cycleGrammar.forArraysInit();
    }

    public void testForIndex() {
        cycleGrammar.forCycleIndex(collectionGrammar.array());
    }

    public void testWhile() {
        cycleGrammar.whileCycle(collectionGrammar.array());
    }
}
