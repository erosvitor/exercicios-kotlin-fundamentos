/*
  Escreva um programa que leia um número inteiro e depois mostre na tela se o número é par ou ímpar.
*/

package com.ctseducare.kotlin.k05_decision_structures

import java.util.Scanner

fun main() {

  val leitura = Scanner(System.`in`)

  println("Verificar se um número é par ou ímpar")
  println("")

  print("Digite um número inteiro maior que zero: ")
  val numero = leitura.nextInt()

  if (numero % 2 == 0) {
    println("O número é PAR")
  } else {
    println("O número é ÍMPAR")
  }

}
