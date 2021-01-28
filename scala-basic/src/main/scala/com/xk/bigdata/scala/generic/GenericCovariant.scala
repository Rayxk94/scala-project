package com.xk.bigdata.scala.generic

/**
 * 协变示例
 */
object GenericCovariant {

  def main(args: Array[String]): Unit = {
    new Message[Person](new Student).loginfo()
    new Message[Person](new Children).loginfo()
  }

  class Person

  class Student extends Person

  class Children extends Student

  class Message[+T](val msg: T) {
    def loginfo(): Unit = {
      println("=========>" + msg)
    }
  }

}