/*
  Escreva um programa que armazene os números 1, 2, 3, 4, 5 e 6 num vetor e depois mostre os dados em
  ordem decrescente.
 */

package com.ctseducare.kotlin.k07_arrays

fun main() {

  println("Ordem decrescente")
  println("")

  val numeros = arrayOf(1, 2, 3, 4, 5, 6)

  for (i in numeros.size-1 downTo 0) {
    println(numeros[i])
  }

}
