package com.xk.bigdata.scala.imp

/**
 * 隐式转换的作用域
 */
object ImplicitScope {

  def main(args: Array[String]): Unit = {


    val person = new Person("hadoop")
    person.fly()
  }
}

class Person(val name: String)

class SuperPerson(val person: Person) {
  def fly(): Unit = {
    println(s"${person.name} is fly")
  }
}

object Person {
  implicit def richPerson(person: Person): SuperPerson = {
    println("隐式转换的作用域")
    new SuperPerson(person)
  }
}

object SuperPerson {

}
