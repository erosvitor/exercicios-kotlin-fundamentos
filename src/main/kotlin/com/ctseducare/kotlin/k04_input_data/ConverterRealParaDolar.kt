/*
  Escreva um programa para converter a moeda Real para a moeda Dolar. O programa deve solicitar ao
  usuário um valor em reais e depois mostrar na tela o valor em dólares. Assumir como cotação do
  dolar o valor de 3,35.
*/

package com.ctseducare.kotlin.k04_input_data

import java.util.Scanner

fun main() {

  println("Converter reais para dólares")
  println("")

  val leitura = Scanner(System.`in`)

  val cotacaoDolar = 3.35

  print("Digite um valor em reais: ")
  val reais = leitura.nextInt()

  val dolares = reais * cotacaoDolar
  println("%d reais equivalem a %.2f dolares".format(reais, dolares))

}
