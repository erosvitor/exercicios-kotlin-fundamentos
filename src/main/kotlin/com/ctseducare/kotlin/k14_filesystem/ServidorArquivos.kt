/*
  Escrever um programa para preparar a estrutura de diretórios para um servidor de arquivos.

  A estrutura de diretórios é mostrada abaixo:

  /docs
  /docs/gerencia
  /docs/gerencia/financeira
  /docs/gerencia/administrativa
  /docs/publico
  /docs/publico/fotos
  /docs/publico/manuais

  Dentro do diretório 'gerencia', criar um arquivo texto chamado 'responsaveis.txt contendo o nome dos
  responsáveis pelo diretório. Os responsáveis são:

  Fulano da Silva
  Beltrano Gomes
  Siclano Cunha

  Dentro do diretório 'publico', criar um arquivo texto chamado 'descricao.txt' contendo o seguinte
  conteúdo:

  Diretório 'fotos'
  Destinado ao armazenamento de fotos de eventos, comemorações e feiras

  Diretório 'manuais'
  Destinado ao armazenamento de manuais dos produtos comercializados pela empresa.
*/

package com.ctseducare.kotlin.k14_filesystem

import java.io.File
import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths

fun main() {

    val diretorioBase = Paths.get("").toAbsolutePath().toString()
    val diretorioDocs = diretorioBase + "/docs"

    var pathDiretorioDocs = Paths.get(diretorioDocs)
    try {
        Files.createDirectory(pathDiretorioDocs)

        Files.createDirectories(Paths.get(diretorioDocs + "/gerencia/financeira"))
        Files.createDirectories(Paths.get(diretorioDocs + "/gerencia/administrativa"))

        Files.createDirectories(Paths.get(diretorioDocs + "/publico/fotos"))
        Files.createDirectories(Paths.get(diretorioDocs + "/publico/manuais"))
    } catch (e: IOException) {
        e.printStackTrace()
        return
    }

    var file = File(diretorioDocs + "/gerencia/responsaveis.txt")
    file.bufferedWriter().use { buffer ->
        buffer.write("Fulano da Silva\n")
        buffer.write("Beltrano Gomes\n")
        buffer.write("Siclano Cunha\n")
    }

    file = File(diretorioDocs + "/publico/descricao.txt")
    file.bufferedWriter().use { buffer ->
        buffer.write("Diretório 'fotos'\n")
        buffer.write("Destinado ao armazenamento de fotos de eventos, comemorações e feiras\n")
        buffer.write("\n")
        buffer.write("Diretório 'manuais'\n")
        buffer.write("Destinado ao armazenamento de manuais dos produtos comercializados pela empresa.\n")
    }

}