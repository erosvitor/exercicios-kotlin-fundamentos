/*
  Criar um programa que leia o nome e a idade de 3 pessoas, guardando-os numa matriz e depois mostre
  o nome da pessoa mais velha.
*/

package com.ctseducare.kotlin.k08_matrices

import java.util.Scanner

fun main() {

  println("Pessoa mais velha")
  println("")

  val leitura = Scanner(System.`in`)

  val pessoas = arrayOf(Array(3) { "" }, Array(2) { "" })

  for (i in pessoas.indices) {
    print("Digite o nome da pessoa " + (i+1))
    pessoas[i][0] = leitura.nextLine()
    print("Digite a idade da pessoa " + (i+1))
    pessoas[i][1] = leitura.nextLine()
  }

  var idadePessoaMaisVelha = 0
  var nomePessoaMaisVelha = ""
  for (i in pessoas.indices) {
    if (pessoas[i][1].toInt() > idadePessoaMaisVelha) {
      idadePessoaMaisVelha = pessoas[i][1].toInt()
      nomePessoaMaisVelha = pessoas[i][0]
    }
  }

  println("A pessoa mais velha é a $nomePessoaMaisVelha")

}
