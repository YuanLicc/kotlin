package com.yl.learn.kotlin.grammar

class FunctionGrammar {

    fun sumOriginal(a : Double, b : Double) : Double {
        return a + b
    }

    fun sum(a : Double, b : Double) : Double? = a?.let {
        b?.let {
            a + b
        }
    }

    fun<T> print(params : Array<T>) {
        params?.forEach {
            param -> print(param)
        }
    }

}