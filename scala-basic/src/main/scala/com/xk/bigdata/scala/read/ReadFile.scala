package com.xk.bigdata.scala.read

import scala.io.Source

/**
 * 读取文件数据
 */
object ReadFile {

  def main(args: Array[String]): Unit = {

    // 读取文件数据
    val words = Source.fromFile("data/wc.txt").getLines()
    while (words.hasNext){
      println(words.next())
    }

  }

}