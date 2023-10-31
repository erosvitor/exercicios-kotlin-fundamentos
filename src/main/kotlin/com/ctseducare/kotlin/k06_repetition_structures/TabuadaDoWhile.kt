/*
  Reescreva o programa Tabuada (que utiliza a estrutura FOR) utilizando a estrutura de repetição
  DO..WHILE.
*/

package com.ctseducare.kotlin.k06_repetition_structures

import java.util.Scanner

fun main() {

  println("Tabuada de um número")
  println("")
    
  val leitura = Scanner(System.`in`)
    
  print("Digite um número inteiro entre 1 e 10: ")
  val numero = leitura.nextInt()
  
  var i = 1
  do {
    println("%d x %d = %d".format(numero, i, numero*i))
    i++
  } while (i <= 10)
    
}
