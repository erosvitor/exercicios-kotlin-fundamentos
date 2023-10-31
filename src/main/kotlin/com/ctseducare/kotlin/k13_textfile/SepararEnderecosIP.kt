/*
  Dado um arquivo texto contendo diversos endereços IP, escrever um programa que separe os IPs em
  outros três arquivos textos, uma para cada classe de IP.

  A separação dos endereços IP deve seguir a seguinte classificação:

  Classe  Faixa de Endereços
  A       0.0.0.1 até 126.255.255.255
  B       128.0.0.0 até 191.255.255.255
  C       192.0.0.0 até 223.255.255.255


  Obs: Armazenar os endereços abaixo num arquivo chamado 'enderecosip.txt'.

  28.210.169.118
  227.95.158.142
  10.247.42.216
  208.57.6.208
  54.28.82.22
  251.215.224.134
  177.82.47.71
  240.124.246.138
  89.251.17.131
  46.86.46.134
  148.201.136.245
  37.21.239.183
  103.166.51.140
  245.185.46.25
  214.214.176.232
  244.53.187.133
  158.83.34.203
  231.72.168.8
  147.92.181.84
  189.89.157.132
*/

package com.ctseducare.kotlin.k13_textfile

import java.io.File
import java.io.FileWriter

fun main() {

  val enderecosIP = File("enderecosip.txt")
  val enderecosClassA = FileWriter("enderecos-classe-a.txt", false)
  val enderecosClassB = FileWriter("enderecos-classe-b.txt", false)
  val enderecosClassC = FileWriter("enderecos-classe-c.txt", false)

  val enderecos:List<String> = enderecosIP.readLines()
  enderecos.forEach { endereco ->
    val posicaoCorte = endereco.indexOf('.')
    val primeiroOctetoStr = endereco.substring(0, posicaoCorte)
    val primeiroOcteto = primeiroOctetoStr.toInt()

    if (primeiroOcteto <= 126) {
      enderecosClassA.write(endereco + "\n")
    } else if (primeiroOcteto <= 191) {
      enderecosClassB.write(endereco + "\n")
    } else {
      enderecosClassC.write(endereco + "\n")
    }
  }
  enderecosClassA.close()
  enderecosClassB.close()
  enderecosClassC.close()

}
