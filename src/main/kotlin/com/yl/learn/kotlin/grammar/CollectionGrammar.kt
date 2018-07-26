package com.yl.learn.kotlin.grammar

import com.yl.learn.kotlin.dto.User

class CollectionGrammar {

    public fun list() = listOf("1", "2", "3")

    fun set() = setOf("1","2")

    fun array() : Array<String> = arrayOf("1", "2", "3")

    fun<T> lambda(collection: Collection<T>) {
        collection.stream().count()
    }

    fun collectUser() : Collection<User> {
        var user = User("Katy")
        user.id = 20
        user.sex = "男"
        return setOf<User>(user)
    }

}