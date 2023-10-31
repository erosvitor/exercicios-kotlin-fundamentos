/*
  O preço consumidor de um carro novo é a soma do custo de fábrica com a porcentagem do distribuidor
  e dos impostos (aplicados ao custo de fábrica). Supondo que a porcentagem do distribuidor seja de
  28% e os impostos sobre o custo de fábrica seja de 45%, crie um programa que leia o custo de
  fábrica de um determinado carro e depois mostre na tela o preço consumidor.
*/

package com.ctseducare.kotlin.k04_input_data

import java.util.Scanner

fun main() {

  println("Calcular preço consumidor")
  println("")

  val leitura = Scanner(System.`in`)

  val porcentagemDistribuidor = 28/100
  val impostos = 45/100

  print("Informe o custo de fábrica: ")
  val custoFabrica = leitura.nextFloat()

  var precoConsumidor = custoFabrica + (custoFabrica * porcentagemDistribuidor)
  precoConsumidor += (precoConsumidor * impostos)
  println("O preço consumidor é de $precoConsumidor")

}
