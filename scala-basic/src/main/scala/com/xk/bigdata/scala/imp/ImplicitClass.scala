package com.xk.bigdata.scala.imp

//import com.xk.bigdata.scala.imp.ImplicitUtils._

/**
 * 需求：
 * 1. 定义 Person 、SuperPerson 类，通过隐式转换使 Person 可以使用 SuperPerson里面的方法
 * 2. 定义一个隐式转换的 SuperPerson2 类，直接 new 一个 Person 就可以使用 SuperPerson2 中的方法
 */
object ImplicitClass {

  def main(args: Array[String]): Unit = {
    val person = new Person("spark")
    person.fly()
  }

  class Person(val name: String)

  class SuperPerson(val name: String) {
    def fly(): Unit = {
      println(s"$name is fly")
    }
  }

  implicit class SuperPerson2(val person: Person) {
    def fly(): Unit = {
      println(s"${person.name} is fly")
    }
  }

}