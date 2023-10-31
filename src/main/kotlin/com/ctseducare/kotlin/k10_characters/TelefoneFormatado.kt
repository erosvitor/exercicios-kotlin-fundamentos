/*
  Criar um programa que solicite ao usuário um número de telefone e depois mostre na tela o número
  formatado seguindo a mascara de formatação (XX) XXXXX-XXXX. Obs.: Independente do jeito que o usuário
  informe o número do telefone, o programa sempre deverá mostrar o telefone seguindo o formato
  (XX) XXXXX-XXXX.
*/

package com.ctseducare.kotlin.k10_characters

import java.util.Scanner

fun main() {

  println("Número Telefone Formatado")
  println()

  val leitura = Scanner(System.`in`)

  print("Digite um número de telefone: ")
  val telefone = leitura.nextLine()

  val telefoneSemFormatacao = StringBuilder()
  for (i in telefone.indices) {
    if (telefone[i].isDigit()) {
      telefoneSemFormatacao.append(telefone[i])
    }
  }

  val telefoneComFormatacao = StringBuilder()
  telefoneComFormatacao.append("(")
  telefoneComFormatacao.append(telefoneSemFormatacao.toString().substring(0,2))
  telefoneComFormatacao.append(")")

  telefoneComFormatacao.append(" ")

  telefoneComFormatacao.append(telefoneSemFormatacao.toString().subSequence(2, 7))
  telefoneComFormatacao.append("-")
  telefoneComFormatacao.append(telefoneSemFormatacao.toString().subSequence(7, 11))

  println(telefoneComFormatacao.toString())
  
}
