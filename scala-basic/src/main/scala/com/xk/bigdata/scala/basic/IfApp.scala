package com.xk.bigdata.scala.basic

object IfApp {

  def main(args: Array[String]): Unit = {
    
    val a = "spark"
    if (a == "hadoop") {
      println(s"$a==hadoop")
    } else if (a == "spark") {
      println(s"$a==spark")
    } else {
      println(s"$a==other")
    }

    val b = if (a == "hadoop") 1 else 2
    println(b)

  }

}
