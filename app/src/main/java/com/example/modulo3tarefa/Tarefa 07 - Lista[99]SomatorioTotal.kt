package com.example.modulo3tarefa

class Lista99SomatorioTotal{
}

fun main() {
    var lista:MutableList<Int> = mutableListOf()
    var n:Int = 1
    var soma:Int = 0

    do{
        lista.add(n)
        println(lista[n-1])
        n += 1
    }while(n!=100)

    n=0
    println("\n")

    do{

        println(soma)
        soma += lista.get(n)
        n+=1
    }while(n!=99)
}