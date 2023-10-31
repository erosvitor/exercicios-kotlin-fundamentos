/*
  Criar um programa que solicite a data de nascimento do usuário e mostre na tela em qual dia da semana
  ele nasceu.
 */

package com.ctseducare.kotlin.k12_datetime

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Scanner

fun main() {

  println("Dia da semana que o usuário nasceu")
  println()

  val leitura = Scanner(System.`in`)

  print("Digite a sua data de nascimento: ")
  val dataNascimentStr = leitura.nextLine()

  val dataNascimento = LocalDate.parse(dataNascimentStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
  val diaSemana = dataNascimento.dayOfWeek.value

  val nomeDiaSemana = when (diaSemana) {
    1 -> "Segunda-feira"
    2 -> "Terça-feira"
    3 -> "Quarta-feira"
    4 -> "Quinta-feira"
    5 -> "Sexta-feira"
    6 -> "Sábado"
    7 -> "Domingo"
    else -> "Inválido"
  }

  if (diaSemana <= 5) {
    println("Você nasceu numa $nomeDiaSemana")
  } else {
    println("Você nasceu num $nomeDiaSemana")
  }

}