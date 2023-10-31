/*
  Criar um programa para verificar se um nome de pessoa é um nome válido. Um nome válido para pessoa é
  aquele que contem apenas letras e espaços em branco.
*/

package com.ctseducare.kotlin.k10_characters

import java.util.Scanner

fun main() {

  println("Nome válido")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite o nome completo de uma pessoa: ")
  val nome = leitura.nextLine()

  var caractere:Char
  var nomeValido = true
  for (i in nome.indices) {
    caractere = nome[i]
    if (!caractere.isLetter() && !caractere.isWhitespace()) {
      nomeValido = false
      break
    }
  }

  if (nomeValido) {
    println("O nome informado é válido")
  } else {
    println("O nome informado é inválido")
  }
  
}
