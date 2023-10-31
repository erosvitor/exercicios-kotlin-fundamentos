/*
  Escreva um programa que armazene temperaturas num vetor e depois mostre na tela a menor e a maior
  temperatura. As temperaturas que devem ser armazenadas no vetor estão relacionadas abaixo.

  27,8  26,9  24,7  26,9  25,8  27,6  23,0  21,2  29,1  25.4
*/

package com.ctseducare.kotlin.k07_arrays

fun main() {

  println("Temperatura mínima e máxima")
  println("")

  val temperaturas = arrayOf(27.8, 26.9, 24.7, 26.9, 25.8, 27.6, 23.0, 21.2, 29.1, 25.4)

  var tempMinima = 999.9
  var tempMaxima = 0.0

  for (i in temperaturas.indices) {
    if (temperaturas[i] < tempMinima) {
      tempMinima = temperaturas[i]
    }
    if (temperaturas[i] > tempMaxima) {
      tempMaxima = temperaturas[i]
    }
  }

  println("Temperatura mínima: $tempMinima")
  println("Temperatura máxima: $tempMaxima")

}
