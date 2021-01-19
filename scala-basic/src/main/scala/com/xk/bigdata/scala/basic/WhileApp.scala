package com.xk.bigdata.scala.basic

object WhileApp {

  def main(args: Array[String]): Unit = {

    var i = 1
    // While 循环
    while (i <= 100) {
      println(i)
      i += 1
    }
    // do While 循环
    do {
      println(i)
      i += 1
    } while (i <= 100)

  }

}
