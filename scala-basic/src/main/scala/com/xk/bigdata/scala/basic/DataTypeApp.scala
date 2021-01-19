package com.xk.bigdata.scala.basic

object DataTypeApp {
  def main(args: Array[String]): Unit = {
    // 判断数据类型
    val a: String = "hadoop"
    println(a.isInstanceOf[String])
    // 强转数据类型
    val b :Int = 111
    val c = b.asInstanceOf[Double]
    println(c)
    println(c.isInstanceOf[Double])
  }
}
