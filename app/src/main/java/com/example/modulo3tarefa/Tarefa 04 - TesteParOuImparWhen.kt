package com.example.modulo3tarefa

class TesteParOuImparWhen {
}

fun main() {
    var numero:Int = 5      //Numero a ser testado
    var resposta:String = when{
        numero % 2 == 0 -> "O numero e par"
        else -> "O numero e impar"
    }
    println(resposta)
}