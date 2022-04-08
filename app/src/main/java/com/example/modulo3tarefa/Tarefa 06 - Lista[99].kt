package com.example.modulo3tarefa

class Lista99{
}

fun main() {
    var lista:MutableList<Int> = mutableListOf()
    var n:Int = 1
    do{
        lista.add(n)
        println(lista[n-1])
        n += 1
    }while(n<=99)
}