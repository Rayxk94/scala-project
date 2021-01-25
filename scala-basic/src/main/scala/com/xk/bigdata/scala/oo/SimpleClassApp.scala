package com.xk.bigdata.scala.oo

object SimpleClassApp {

  def main(args: Array[String]): Unit = {
    val simpleClass = new SimpleClass
    simpleClass.age_$eq(16)
    println(s"${simpleClass.name}========>${simpleClass.age}")
    simpleClass.eat()
  }

}

class SimpleClass {

  val name: String = "spark"
  var age: Int = _

  def eat(): Unit = {
    println(s"$name eat")
  }
}
