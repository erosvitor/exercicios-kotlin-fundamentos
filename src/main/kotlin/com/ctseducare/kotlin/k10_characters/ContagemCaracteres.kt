/*
  Criar um programa que leia um texto e depois mostre na tela a quantidade de caracteres excluindo os
  espaços em branco.
*/

package com.ctseducare.kotlin.k10_characters

import java.util.Scanner

fun main() {

  println("Contagem de Caracteres")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite um texto qualquer: ")
  val texto = leitura.nextLine()

  var totalCaracteres = 0
  var caractere:Char
  for (i in texto.indices) {
    caractere = texto[i]
    if (!caractere.isWhitespace()) {
      totalCaracteres++
    }
  }

  println("O texto informado possui $totalCaracteres caracteres, excluindo os espaços em branco.")

}
