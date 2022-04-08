package com.example.modulo3tarefa

class TesteParOuImpar {
}

//Resolucao usando toda a pratica aprendida

fun main() {
    var resultado: Int
    var resposta: String
    println("Insira o primeiro numero: ")
    var numeroString = readLine()
    var numero = numeroString!!.toInt()
    resultado = numero % 2

    //Usando If/Else
    if(resultado == 0){
        resposta = "par"
        println("O numero $numero é $resposta!")
    }else{
        resposta = "Impar"
        println("O numero $numero é $resposta!")
    }

    //Usando When
    resposta = when{
        resultado == 0 -> "O numero $numero é par!"
        else -> "O numero $numero é impar!"
    }

}

//Formas Ensinadas

/*
fun main() {
    var parImpar: String
    var numero = 4

    parImpar = if(numero % 2 == 0) "par" else "impar"
    println("O numero $numero é $parImpar")
}

fun main() {
    var numero = 5
    var parImpar: String

    parImpar = when{
        numero % 2 == 0 -> "par"
        else -> "impar"
    }
    println("O numero $numero é $parImpar")
}
 */