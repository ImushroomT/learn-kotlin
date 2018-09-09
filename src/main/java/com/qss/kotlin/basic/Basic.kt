package com.qss.kotlin.basic

import java.util.*

/**
 * @author       qiushengsen
 * @company      京东成都研究院-供应链
 * @dateTime     2018/8/24 下午5:34
 * @descripiton
 **/

fun sum(a: Int, b: Int) : Int {
    return a + b
}

fun sum1(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) = println(a + b)

fun getStringLen(obj: Any): Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

fun helloFor() {
    var items = listOf("banana", "apple", "orange")
    for (item in items) {
        println(item)
    }
    for(index in items.indices) {
        println(items[index])
    }
    //lambda
    items.filter {it.length > 5}
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}


fun main(args: Array<String>) {
    println(sum(1, 2))
    println(sum1(2,3))
    println("sum 1 plus 1 is ${sum1(1, 1)}")
    printSum(2, 3)
    var str = "hello"
    println("'$str' length is ${getStringLen(str)}")
    println(listOf(Any()))
    helloFor()
    val list = ArrayList<String>()
    list.add("a")
    list?.forEach { println(it) }
}
