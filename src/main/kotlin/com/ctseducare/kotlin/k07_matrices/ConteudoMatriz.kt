/*
  Escreva um programa que leia 4 números inteiros e guarde-os numa matriz 2x2. Depois da leitura dos
  números, mostrar na tela o conteúdo da matriz.
*/

package com.ctseducare.kotlin.k07_matrices

import java.util.Scanner

fun main() {

  println("Mostra conteúdo de uma matriz")
  println("")

  val leitura = Scanner(System.`in`)

  val matriz = arrayOf(Array(2) {0}, Array(2) {0})

  for (i in matriz.indices) {
    for (j in matriz[i].indices) {
      print("Digite o elemento para a posição %d,%d da matriz: ".format(i, j))
      matriz[i][j] = leitura.nextInt()
    }
  }

  for (i in matriz.indices) {
    for (j in matriz[i].indices) {
      print(matriz[i][j])
    }
    println("")
  }

}
