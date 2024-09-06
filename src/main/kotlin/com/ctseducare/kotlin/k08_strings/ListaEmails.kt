/*
  Criar um programa que prepare uma lista de emails para uma mala direta. O programa deverá armazenar
  as linhas abaixo num vetor, extrair de cada linha o email e armazenar num outro vetor. O programa
  deverá mostrar na tela a lista de email processada.

    Beltrano da Silva;beltrano@gmail.com
    Siclano Goncalves;siclano@yahoo.com.br
    Fulano Pereira Alves;fulanoalves@gmail.com
    Alvarenga Pedroso;pedroso@hotmail.com
*/

package com.ctseducare.kotlin.k08_strings

fun main() {

  println("Lista de emails para mala direta")
  println()

  val dados = arrayOf(
    "Beltrano da Silva;beltrano@gmail.com",
    "Siclano Goncalves;siclano@yahoo.com.br",
    "Fulano Pereira Alves;fulanoalves@gmail.com",
    "Alvarenga Pedroso;pedroso@hotmail.com"
  )

  val emails = Array(dados.size) { "" }

  var posicaoDoCorte:Int
  for (i in dados.indices) {
    posicaoDoCorte = dados[i].indexOf(";") + 1
    emails[i] = dados[i].substring(posicaoDoCorte)
  }

  for (i in emails.indices) {
    println(emails[i])
  }

}
