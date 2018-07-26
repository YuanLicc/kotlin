package com.yl.learn.kotlin.dto

open class User constructor(var name: String) {

    var id : Int = -1
    var sex : String = "男"

    init {
        name = name?.trim()
    }

}