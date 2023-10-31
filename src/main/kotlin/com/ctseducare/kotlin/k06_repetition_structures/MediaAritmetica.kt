/*
  Utilizando a estrutura de repetição WHILE, escreva um programa que solicite ao usuário quatro números
  inteiros e depois mostre na tela a média aritmética dos números informados.
*/

package com.ctseducare.kotlin.k06_repetition_structures

import java.util.Scanner

fun main() {

  val leitura = Scanner(System.`in`)

  println("Média Aritmética")
  println("")
      
  var qtde = 1
  var nota: Float
  var somaDasNotas = 0.0
  while (qtde <= 4) {
    print("Digite a nota $qtde: ")
    nota = leitura.nextFloat()
    somaDasNotas += nota
    qtde++
  }
    
  val media = somaDasNotas / 4
  println("A média aritmética é: $media")

}
