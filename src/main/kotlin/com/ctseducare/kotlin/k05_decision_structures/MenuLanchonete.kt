/*
  Escreva um programa que permita o usuário escolher um produto de um menu de lanches de uma lanchonete.
  Após o usuário selecionar o item, o programa deve mostrar na tela qual foi o item selecionado pelo
  usuário. O menu de lanches que deve ser exibido pelo programa é o seguinte:

    1 – X-Salada
    2 – X-Bacon
    3 – X-Egg
    4 – Refrigerante
    5 – Finalizar pedido
 */

package com.ctseducare.kotlin.k05_decision_structures

import java.util.Scanner

fun main() {

  val leitura = Scanner(System.`in`)

  println("Menu lanchonete")
  println("")
  println("1 – X-Salada")
  println("2 – X-Bacon")
  println("3 – X-Egg")
  println("4 – Refrigerante")
  println("5 – Finalizar pedido")

  print("Escolha um item do menu: ")
  val item = leitura.nextInt()

  when (item) {
    1 -> println("Você escolheu X-Salada")
    2 -> println("Você escolheu X-Bacon")
    3 -> println("Você escolheu X-Egg")
    4 -> println("Você escolheu Refrigerante")
    5 -> println("Você escolheu finalizar pedido")
    else -> println("Item inexistente")
  }

}

