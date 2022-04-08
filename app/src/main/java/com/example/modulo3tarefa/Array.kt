package com.example.modulo3tarefa

class Array {
}

//1criar um array de int[40] que escreva 1~39 usando FOR
/*
    Resposta


var array1a39: IntArray = IntArray(39)
    var numeroArray: Int = 0
    var numeroLoop: Int = 0
    var numero: Int = 1
    var array: IntArray = IntArray(40)
    do{
        array1a39[numeroArray] = numero
        numero= numero+1
        numeroArray++
    }while (numeroArray!=39)


    for ((index,value) in array1a39.withIndex()) {
        println(value)
    }

 */

//2criar lista de Int de 1~99 no array usando for
/*
    Resposta
//2
    var lista:MutableList<Int> = mutableListOf()
    var n:Int = 1
    do{
        lista.add(n)
        println(lista[n-1])
        n += 1
    }while(n!=100)

 */
//3utilizando a lista anterior criar uma variavel
//              int de nome soma e iniciar ela
//              com valor 0, fazer ela ler o list
//              anterior e somar cada numero com o proximo
/*
    Resposta
//3
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

 */
fun main() {
    //3
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





   /*
    ANOTACAO
   var array : IntArray = IntArray (40)
    var numeroPrincipal: Int = 0
    var numeroArray: Int = 0
    var parOuImpar: Int = 0
    println("Numeros Pares de 1 a 100")
    numeroPrincipal = 1

    do{
        parOuImpar = numeroPrincipal % 2
        if(parOuImpar == 0){
            array[numeroArray] = numeroPrincipal
            println("O numero $numeroPrincipal é par")
            numeroArray++
        }
        numeroPrincipal++
    }while(numeroPrincipal <= 50)

    */

}


