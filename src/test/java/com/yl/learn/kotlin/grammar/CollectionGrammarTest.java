package com.yl.learn.kotlin.grammar;

import junit.framework.TestCase;

public class CollectionGrammarTest extends TestCase {
    CollectionGrammar collectionGrammar = new CollectionGrammar();

    public void testList() {
        collectionGrammar.list();
    }

    public void testSet() {
        collectionGrammar.set();
    }

    public void testArray() {
        collectionGrammar.array();
    }

    public void testLambda() {
        collectionGrammar.lambda(collectionGrammar.list());

        collectionGrammar.lambda(collectionGrammar.set());
    }

    public void testCollectionUser() {

        collectionGrammar.collectUser();
    }
}
