package com.xk.bigdata.scala.generic

/**
 * 上界示例
 */
object GenericUpBound {

  def logingo[T <: Student](msg: T): Unit = {
    println("=========>" + msg)
  }

  def main(args: Array[String]): Unit = {
    logingo[Student](new Student)
    logingo[Children](new Children)
  }

  class Person

  class Student extends Person

  class Children extends Student
}
