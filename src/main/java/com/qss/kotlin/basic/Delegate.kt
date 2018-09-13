package com.qss.kotlin.basic

/**
 * @author       qiushengsen
 * @company      京东成都研究院-供应链
 * @dateTime     2018/9/11 下午1:46
 * @descripiton
 **/

class Example {
    val name : String by lazy {
        println("lazy load")
        "hello"
    }
}

fun main(args: Array<String>) {
    var example = Example()
    println(example.name)
    example.name
}