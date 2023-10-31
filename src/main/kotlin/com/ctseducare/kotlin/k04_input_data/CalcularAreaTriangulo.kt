/*
  Escreva um programa para calcular a área de um triângulo. O programa deve solicitar ao usuário a
  base e a altura do triângulo. Deve calcular a área e depois mostrar o resultado na tela. A fórmula
  para calcular a área de um triângulo é A = (base x altura) / 2.
*/

package com.ctseducare.kotlin.k04_input_data

import java.util.Scanner

fun main() {

  println("Calcular área de um triângulo")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite a base do triângulo: ")
  val base = leitura.nextInt()

  print("Digite a altura do triângulo: ")
  val altura = leitura.nextInt()

  val area = (base * altura) / 2
  println("A área do triângulo é: $area")

}