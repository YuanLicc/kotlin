package com.yl.learn.kotlin.grammar

class CycleGrammar {

    fun<T> forCycle(arrays : Array<T>) {
        for (array in arrays) {
            print(array.toString() + " ")
        }
    }

    fun<T> forArraysInit() {
        for (item in 1..9) {
            print("1..9 : " + item.toString() + " ")
        }

        for (item in 1 until 9) {
            print("1 until 9 : " + item.toString() + " ")
        }

        for (item in 9 downTo 0) {
            print("9 downTo 0 : " + item.toString() + " ")
        }

        for (item in 9 downTo 0 step 3) {
            print("9 downTo 0 step 3 : " + item.toString() + " ")
        }
    }

    fun<T> forCycleIndex(arrays: Array<T>) {
        for (index in arrays.indices) {
            print(arrays[index].toString() + " ")
        }
    }

    fun<T> whileCycle(arrays: Array<T>) {
        var index = 0
        while (index < arrays.size) {
            print(arrays[index].toString() + " ")
            index++
        }
    }

}