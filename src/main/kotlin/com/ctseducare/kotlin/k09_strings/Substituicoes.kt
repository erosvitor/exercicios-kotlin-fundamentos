/*
  Criar um programa que armazene o texto abaixo num variável e depois faça as substituições necessárias
  para que o texto possa ser importado por um outro programa.

    Texto que deve ser armazenado

      0001;Siclano Pereira Alves;10-05-2000;(41)998885453;siclano@gmail.com

    Substituições:

      - Remover os parênteses do código de área do telefone
      - Substituir os caracteres '-' da data pelo caractere '/'
      - Converter todo o texto para maiúsculo
*/

package com.ctseducare.kotlin.k09_strings

import java.util.Locale

fun main() {

  var texto = "0001;Siclano Pereira Alves;10-05-2000;(41)998885453;siclano@gmail.com;"

  texto = texto.replace("(", "")
  texto = texto.replace(")", "")

  texto = texto.replace("-", "/")

  texto = texto.uppercase(Locale.getDefault())

  println(texto)

}
