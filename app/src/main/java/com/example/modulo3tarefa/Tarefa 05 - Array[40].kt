package com.example.modulo3tarefa

class Array40ComFor {
}

fun main() {
    var array1a39: IntArray = IntArray(39)
    var numeroArray: Int = 0
    var numero: Int = 1

    do{
        array1a39[numeroArray] = numero
        numero += 1
        numeroArray++
    }while (numeroArray!=39)

    for ((index,value) in array1a39.withIndex()) {
        println(value)
    }
}

