/*
  Dado um arquivo texto contendo dados de clientes, escrever um programa que extrai o endereço de email
  e gere um segundo arquivo contendo apenas os emails.

  Obs1: Os emails devem ser armazenados no novo arquivo sem espaços em branco no inicio e também sem as
  aspas simples.

  Obs2: Armazenar os dados abaixo num arquivo chamado 'clientes.txt'

  'Beltrano Cunha', '41-988771212', 'beltrano@gmail.com', '1975/10/12', 'M'
  'Siclano Pereira', '41-34346789', 'siclanopereira@yahoo.com.br', '1978/06/20', 'M'
  'Fulano da Silva', '41-989983221', 'fulanosil@gmail.com', '1982/01/25', 'M'
  'Acrópolis da Penha', '41-997970101', 'acropolispenha@hotmail.com', '1981/12/02', 'M'
  'Mitrus Gonçalves', '41-34560303', 'mitrusgon@yahoo.com.br', '1977/11/05', 'M'
  'Bino Alvarenga', '41-988019902', 'binoalv@gmail.com', '1981/04/12', 'M'
  'Goman da Silva', '41-997790506', 'gomansilva@yahoo.com.br', '1983/07/21', 'M'
  'Sincom Gomes', '41-981125654', 'sincomg@gmail.com', '1981/09/06', 'M'
  'Beltrana Gomes da Silva', '41-981125654', 'beltranasilva@gmail.com', '1979/10/15', 'F'
  'Siclana Pinheiro', '41-32334554', 'siclanapi@hotmail.com', '1979/10/15', 'F'
  'Fulana Pedrosa', '41-981125654', 'fulanapedrosa@yahoo.com.br', '1980/12/03', 'F'
*/

package com.ctseducare.kotlin.k13_textfile

import java.io.File

fun main() {

  val customers = File("clientes.txt")
  val listaEmails = File("lista-emails.txt")

  val bufferInput: List<String> = customers.readLines()
  listaEmails.bufferedWriter().use { buffer ->
    bufferInput.forEach { line ->
      val data = line.split(",")
      var email = data[2]
      // Remove possíveis espaços em branco
      email = email.trim()
      //  Remove aspas simples
      email = email.replace("'", "")
      
      buffer.write(email + "\n")
    }
  }

}
