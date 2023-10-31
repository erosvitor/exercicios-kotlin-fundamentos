/*
  Escreva um programa que permita o usuário escolher vários itens do menu de lanches de uma lanchonete.
  O menu que o programa deve exibir esta abaixo:

    1 – X-Salada (5,30)
    2 – X-Bacon (6,00)
    3 – X-Egg (6,70)
    4 – Refrigerante (3,20)
    5 – Finalizar pedido
    Digite o código do lanche desejado:

  Observações:
  O programa deve permitir que o usuário escolha mais de um produto.
  A medida que o usuário vai escolhendo os itens, deve-se somar o valor dos itens escolhidos.
  Quando o usuário escolher a opção 5 (Finalizar pedido), o programa deverá mostrar na tela o total
  dos itens escolhidos pelo usuário.
*/

package com.ctseducare.kotlin.k06_repetition_structures

import java.util.Scanner

fun main() {

  println("Menu lanchonete")
  println()

  val leitura = Scanner(System.`in`)

  var totalPedido = 0.0

  var item: Int
  do {
    println("1 – X-Salada (5,30)")
    println("2 – X-Bacon (6,00)")
    println("3 – X-Egg (6,70)")
    println("4 – Refrigerante (3,2)")
    println("5 – Finalizar pedido")

    print("Escolha um item do menu: ")
    item = leitura.nextInt()

    when (item) {
      1 -> {
        println("Você escolheu X-Salada")
        totalPedido += 5.30
      }
      2 -> {
        println("Você escolheu X-Bacon")
        totalPedido += 6.00
      }
      3 -> {
        println("Você escolheu X-Egg")
        totalPedido += 6.70
      }
      4 -> {
        println("Você escolheu Refrigerante")
        totalPedido += 3.2
      }
      5 -> break
      else -> println("Item inexistente")
    }
  } while (true)

  println("O total do seu pedido é: $totalPedido")

}
