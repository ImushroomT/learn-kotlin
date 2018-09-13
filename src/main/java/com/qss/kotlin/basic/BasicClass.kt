package com.qss.kotlin.basic

import kotlin.properties.Delegates

/**
 * @author       qiushengsen
 * @company      京东成都研究院-供应链
 * @dateTime     2018/9/5 下午8:56
 * @descripiton
 **/

@Deprecated("deprecated")
fun dep() {}

//扩展函数
fun String.sout() {
    println(this)
}



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
//数据类
data class Person(var age: Int = 0, var name: String = "")

open class Base<out T>;

class User {
    var str: String by Delegates.observable("origin"){
        prop, old, new ->
        println("$old -> $new")
    }
}

fun main(args: Array<String>) {
    val first = First(1)
    var child = Child(10, "jason")
    println(child.listInfo())
    val str = "hello"
    str.sout()
    var person1 = Person(12, "jimmy")
    person1 = person1.copy(age = 13)
    println(person1.toString())
    var (age, name) = person1
    var a1 = Base<String>()
    var a2 : Base<Any> = a1
    var user = User()
    user.str = "x"
}
