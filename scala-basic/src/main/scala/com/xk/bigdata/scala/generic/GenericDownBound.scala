package com.xk.bigdata.scala.generic

/**
 * 下界示例
 */
object GenericDownBound {

  def logingo[T >: Student](msg: T): Unit = {
    println("=========>" + msg)
  }

  def main(args: Array[String]): Unit = {
    logingo[Person](new Person)
    logingo[Student](new Student)
  }

  class Person

  class Student extends Person

  class Children extends Student

}