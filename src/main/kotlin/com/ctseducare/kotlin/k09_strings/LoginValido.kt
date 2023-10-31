/*
  Criar um programa que solicite um login e verifique se o login é válido. O login será válido ser for
  diferente de branco. Exibir a mensagem 'Login Válido' caso o login seja diferente de branco, caso
  contrário, exibir a mensagem 'Login inválido'.
*/

package com.ctseducare.kotlin.k09_strings

import java.util.Scanner

fun main() {

  println("Login")
  println("")

  val leitura = Scanner(System.`in`)

  var login:String
  var loginValido:Boolean
  do {
    print("Digite o login: ")
    login = leitura.nextLine()

    if (login.isBlank()) {
      println("Login inválido, tente novamente.")
      loginValido = false
    } else {
      println("Login válido.")
      loginValido = true
    }
  } while (!loginValido)

}
