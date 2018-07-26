package com.yl.learn.kotlin.grammar

class WhenGrammar {

    fun whenGrammar(case : String) {
        when (case) {
            "1","1.0" -> print(1)
            else -> print("else")
        }
    }

    fun whenGrammar(collection: Collection<String>) {
        when {
            "1" in collection -> print("1");
            else -> print("else")
        }
    }

}