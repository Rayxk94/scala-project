package com.xk.bigdata.scala.oo

object CaseClassApp {

  def main(args: Array[String]): Unit = {
    val person1 = new Person1("hadoop", 18)
    val person2 = new Person1("hadoop", 18)
    println(person1.toString)
    println(person1 == person2)
    val person3 = Person2("hadoop", 18)
    val person4 = Person2("hadoop", 18)
    println(person3.toString)
    println(person3 == person4)
  }

  class Person1(val name: String, val age: Int)

  case class Person2(name: String, age: Int)

}
