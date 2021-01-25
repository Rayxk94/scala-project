package com.xk.bigdata.scala.oo

object CaseClassCaseObjectApp {
  def main(args: Array[String]): Unit = {
    // 调用 case class eat
    val person1 = new Per("hadoop", 18)
    person1.eat()
    // 调用 case object eat
    Per.eat()
  }
}

case class Per(name: String, age: Int) {
  def eat(): Unit = {
    println("case class Person eat")
    println(s"$name is eat")
  }
}

case object Per {
  def eat(): Unit = {
    println("case object Person eat")
    println("eat")
  }
}
