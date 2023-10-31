/*
  Escreva um programa que calcule o juros simples sobre um determinado valor. A fórmula para calcular
  simples simples é a seguinte:

    J = C x I x N

    onde:
      J = juros calculado
      C = capital
      I = taxa
      N = período

      Obs.: Considerar taxa mensal e o período em meses.
*/

package com.ctseducare.kotlin.k04_input_data

import java.util.Scanner

fun main() {

   println("Calcular Juros Simples")
   println("")

   val leitura = Scanner(System.`in`)

   print("Digite o capital: ")
   val capital = leitura.nextFloat()

   print("Digite a taxa de juros (mensal): ")
   val taxa = leitura.nextFloat()

   print("Digite o período (em meses): ")
   val periodo = leitura.nextInt()

   val juros = capital * (taxa/100) * periodo
   println("O juros calculado foi de $juros")

}
