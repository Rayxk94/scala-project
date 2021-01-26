package com.xk.bigdata.scala.wc

import scala.io.Source

object WcApp {

  def main(args: Array[String]): Unit = {
    val list = Source.fromFile("data/wc.txt").getLines().toList
    list.flatMap(_.split(","))
      .map((_, 1))
      .groupBy(_._1)
      .mapValues(_.size)
      .foreach(println)
  }

}
