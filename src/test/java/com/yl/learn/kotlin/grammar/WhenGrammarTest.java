package com.yl.learn.kotlin.grammar;

import junit.framework.TestCase;

public class WhenGrammarTest extends TestCase {

    private static WhenGrammar whenGrammar = new WhenGrammar();

    private static CollectionGrammar collectionGrammar = new CollectionGrammar();

    public void testWhen() {
        whenGrammar.whenGrammar("1");
        whenGrammar.whenGrammar("1.0");
        whenGrammar.whenGrammar("ccc");
    }

    public void testWhenIn() {
        whenGrammar.whenGrammar(collectionGrammar.list());

        whenGrammar.whenGrammar(collectionGrammar.set());
    }
}
