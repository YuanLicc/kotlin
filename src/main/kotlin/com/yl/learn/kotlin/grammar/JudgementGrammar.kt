package com.yl.learn.kotlin.grammar

class JudgementGrammar {

    fun isZero(number: Int) : Boolean  {
        if(number == 0) {
            return true
        }
        return false
    }

    fun<T> isEmpty(array: Array<T>) = array != null && array.isEmpty()
}