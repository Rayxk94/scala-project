package com.xk.bigdata.scala.oo

object ClassObjectApp {

  def main(args: Array[String]): Unit = {
    // 调用伴生类
    val person1 = new Person("hadoop", 21)
    person1.eat()
    // 调用伴生对象
    val person2 = Person("hadoop", 21)
    person2.eat()
    // 调用伴生对象的 unapply 方法
    val Person(name, age) = Person("hadoop", 21)
    println(s"name:$name==========age:$age")
  }

}

object Person {
  def apply(name: String, age: Int): Person = {
    println("调用 object Person 的 apply 方法")
    new Person(name, age)
  }

  def unapply(arg: Person): Option[(String, Int)] = {
    println("调用 object Person 的 unapply 方法")
    Option(arg.name, arg.age)
  }
}

class Person(val name: String, val age: Int) {
  def eat(): Unit = {
    println(s"$name is eat")
  }
}