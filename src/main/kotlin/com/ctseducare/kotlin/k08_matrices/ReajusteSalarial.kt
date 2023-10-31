/*
  Criar um programa que armazene os dados dos funcionários em uma matriz e depois aplique o reajuste
  salarial e mostre na tela os salários reajustados.

    Dados dos funcionários

      1001,1,5400.00
      1002,1,5500.00
      1003,2,4250.00
      1004,2,4400.00
      1005,2,4180.00
      1006,3,2700.00

      onde:

        - A primeira coluna é o código do funcionário
        - A segunda coluna é o código do cargo do funcionário
        - A terceira coluna é o salário do funcionário

    Regras para o reajuste salarial

      - Para cargos de gerêntes (código 1) reajustar em 10%
      - Para cargos de supervisores (código 2) reajustar em 8%
      - Para cargos de analistas (código 3) reajustar em 6%
*/

package com.ctseducare.kotlin.k08_matrices

fun main() {

  println("Reajuste Salarial")
  println("")

  val dadosFuncionarios = arrayOf(
    doubleArrayOf(1001.0, 1.0, 5400.00),
    doubleArrayOf(1002.0, 1.0, 5500.00),
    doubleArrayOf(1003.0, 2.0, 4250.00),
    doubleArrayOf(1004.0, 2.0, 4400.00),
    doubleArrayOf(1005.0, 2.0, 4180.00),
    doubleArrayOf(1006.0, 3.0, 2700.00)
  )

  for (i in dadosFuncionarios.indices) {
    if (dadosFuncionarios[i][1] == 1.0) {
      dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.10
    } else if (dadosFuncionarios[i][1] == 2.0) {
      dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.08
    } else if (dadosFuncionarios[i][1] == 3.0) {
      dadosFuncionarios[i][2] += dadosFuncionarios[i][2] * 0.06
    }
  }

  for (i in dadosFuncionarios.indices) {
    println("Código funcionário: %.0f, salário reajustado: %.2f".format(dadosFuncionarios[i][0], dadosFuncionarios[i][2]))
  }

}
