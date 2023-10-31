/*
  Escreva um programa que armazene os números 8, 6, 27, 13, 36 e 9 num vetor e depois mostre na tela
  os números que são divisíveis por 3.
*/

package com.ctseducare.kotlin.k07_arrays

fun main() {

  println("Números divisíveis por três")
  println("")

  val numeros = arrayOf(8, 6, 27, 13, 36, 9)

  for (i in numeros.indices) {
    if (numeros[i] % 3 == 0) {
      println(numeros[i])
    }
  }

}
