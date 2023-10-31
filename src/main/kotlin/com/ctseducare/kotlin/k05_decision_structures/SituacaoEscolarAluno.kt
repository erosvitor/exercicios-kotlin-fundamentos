/*
  Escreva um programa que mostre a situação escolar de um determinado aluno. O programa deverá
  solicitar ao usuário quatro notas bimestrais e depois mostrar se o aluno foi aprovado, reprovado ou
  recuperação. Se média for igual ou maior do que 70.0, mostrar APROVADO. Se a média for igual ou maior
  do que 40.0, mostrar EM RECUPERAÇÃO. Caso seja menor do que 40.0, mostrar REPROVADO.
 */

package com.ctseducare.kotlin.k05_decision_structures

import java.util.Scanner

fun main() {

  val leitura = Scanner(System.`in`)

  println("Verificar a situção escolar de um aluno")
  println("")

  print("Digite a nota do primeiro bimestre: ")
  val nota1 = leitura.nextInt()

  print("Digite a nota do segundo bimestre: ")
  val nota2 = leitura.nextInt()

  print("Digite a nota do terceiro bimestre: ")
  val nota3 = leitura.nextInt()

  print("Digite a nota do quarto bimestre: ")
  val nota4 = leitura.nextInt()

  val media = (nota1+nota2+nota3+nota4) / 4

  if (media >= 70.0) {
    println("O aluno esta aprovado")
  } else if (media < 40.0) {
    println("O aluno esta reprovado")
  } else {
    println("O aluno esta em recuperação")
  }
  
}
