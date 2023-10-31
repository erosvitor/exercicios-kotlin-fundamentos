/*
  Utilizando a estrutura de repetição FOR, escreva um programa que mostre na tela os números divisíveis
  por 3 que estão entre os números de 0 e 100.
*/

package com.ctseducare.kotlin.k06_repetition_structures

fun main() {

  println("Números divisíveis por 3 entre 0 e 100")
  println("")
    
  for (numero in 0..100) {
    if (numero % 3 == 0) {
      println(numero)
    }
  }

}

