/*
  Criar um programa que solicite ao usuário um login e uma senha e depois mostre na tela se o login e a
  senha são válidos. Para que um login e uma senha sejam válidos, as regras abaixo devem ser atendidas.

    - Login e senha devem ser diferentes
    - Login e senha devem ter entre 5 a 15 caracteres
    - Senha deve ter pelo menos um digite numérico e uma letra maiúscula
 */

package com.ctseducare.kotlin.k08_caracteres

import java.util.Scanner

fun main() {

  println("Login e Senha")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite o login: ")
  val login = leitura.nextLine()

  print("Digite a senha: ")
  val senha = leitura.nextLine()

  if (login.equals(senha)) {
    println("Login e Senha não podem ser iguais.")
  } else if (login.length < 5 || login.length > 15) {
    println("O login deve ter entre 5 e 15 caracteres")
  } else if (senha.length < 5 || senha.length > 15) {
    println("A senha deve ter entre 5 e 15 caracteres")
  } else {
    var temDigitoNumerico = false
    var temLetraMaiuscula = false
    var caractere:Char
    for (i in senha.indices) {
      caractere = senha[i]
      if (caractere.isDigit()) {
        temDigitoNumerico = true
        continue
      }
      if (caractere.isUpperCase()) {
        temLetraMaiuscula = true
      }
    }
    if (temDigitoNumerico && temLetraMaiuscula) {
      println("Login e Senha válidos")
    } else {
      println("A senha deve ter pelo menos um dígito e pelo menos uma letra maiúsucla.")
    }
  }
  
}
