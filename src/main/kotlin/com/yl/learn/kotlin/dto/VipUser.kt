package com.yl.learn.kotlin.dto

open class VipUser(name : String) : User(name) {

    var vipLevel : Int = 0

    constructor(name : String, vipLevel: Int) : this(name) {
        this.vipLevel = vipLevel
    }

}