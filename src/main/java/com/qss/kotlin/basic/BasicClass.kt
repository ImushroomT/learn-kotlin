package com.qss.kotlin.basic

/**
 * @author       qiushengsen
 * @company      京东成都研究院-供应链
 * @dateTime     2018/9/5 下午8:56
 * @descripiton
 **/


class First{
    constructor(age:Int){
        println(age)
    }
}

open class Parent(var age: Int = 0, var name: String = "") {
    constructor(age: Int) : this(age, "")
    constructor(name: String) : this(0, name)
    open fun listInfo() : String = "name is $name, age is $age"
}

class Child(age: Int, name: String) : Parent(age, name) {
    constructor(age: Int) : this(age, "")
    constructor(name: String) : this(0, name)
    override fun listInfo(): String {
        return super.listInfo() + "child"
    }
}

fun main(args: Array<String>) {
    val first = First(1)
    var child = Child(10, "jason")
    println(child.listInfo())
}
