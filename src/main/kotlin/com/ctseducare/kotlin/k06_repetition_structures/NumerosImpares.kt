/*
  Utilizando a estrutura de repetição WHILE, escreva um programa que mostre na tela todos os números
  ímpares entre os números 0 e 100.
*/

package com.ctseducare.kotlin.k06_repetition_structures

fun main() {

  println("Números ímpares entre 0 e 100")
  println("")
    
  var numero = 0
  while (numero <= 100) {
    if (numero % 2 != 0) {
      println(numero)
    }
    numero++;
  }

}
