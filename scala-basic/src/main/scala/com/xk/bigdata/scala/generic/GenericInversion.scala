package com.xk.bigdata.scala.generic

/**
 * 逆变示例
 */
object GenericInversion {

  def main(args: Array[String]): Unit = {
    val student: Message1[Student1] = new Message1[Student1]()
    val child: Message1[Children1] = student
    println(child)
  }

  class Person1

  class Student1 extends Person1

  class Children1 extends Student1

  class Message1[-T]() {
  }

}