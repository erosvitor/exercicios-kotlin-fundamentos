/*
  Criar um programa que solicite o nome completo do usuário e depois mostre na tela o primeiro nome do
  usuário.
 */

package com.ctseducare.kotlin.k09_strings

import java.util.Scanner

fun main() {

  println("Primeiro nome")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite seu nome completo: ")
  val nomeCompleto = leitura.nextLine()

  val primeiroNome = nomeCompleto.substring(0, nomeCompleto.indexOf(" "))
  println("Seu primeiro nome é $primeiroNome")

}
