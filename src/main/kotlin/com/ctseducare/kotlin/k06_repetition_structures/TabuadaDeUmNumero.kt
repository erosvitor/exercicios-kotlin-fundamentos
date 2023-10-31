/*
  Utilizando a estrutura de repetição FOR, escreva um programa que solicite ao usuário um número
  inteiro e depois mostre na tela a tabuada do número informado no seguinte formato:

    N x 1 = Y
    N x 2 = Y
    ...
    N x 10 = Y

    onde:
      N é o número informado pelo usuário
      Y é o resultado da multiplicação
*/

package com.ctseducare.kotlin.k06_repetition_structures

import java.util.Scanner

fun main() {

  println("Tabuada de um número")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite um número inteiro entre 1 e 10: ")
  val numero = leitura.nextInt()

  for (i in 1..10) {
    println("%d x %d = %d".format(numero, i, numero*i))
  }

}
