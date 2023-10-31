/*
  Escreva um programa que solicite um dia da semana (entre 1 a 7) e depois mostre o nome por extenso do
  dia informado. Caso o usuário informe um dia inválido, o programa deverá mostrar uma mensagem
  informando que o dia é inválido. Por exemplo, o usuário digitou o dia da semana 1, o programa deverá
  mostrar na tela 'Domingo'.
 */

package com.ctseducare.kotlin.k05_decision_structures

import java.util.Scanner

fun main() {

  println("Dia da semana por extenso")
  println("")

  val leitura = Scanner(System.`in`)

  print("Digite o dia da semana (1-7): ")
  val diaSemana = leitura.nextInt()

  when (diaSemana) {
    1 -> println("Domingo")
    2 -> println("Segunda-feira")
    3 -> println("Terça-feira")
    4 -> println("Quarta-feira")
    5 -> println("Quinta-feira")
    6 -> println("Sexta-feira")
    7 -> println("Sábado")
    else -> println("Dia da semana inválido")
  }

}
