package com.xk.bigdata.scala.oo

object AbstractClassApp {

  def main(args: Array[String]): Unit = {
    // 通过显示定义子类
    val student = new Student("hadoop", 20)
    student.speak
    // 匿名子类
    val student2 = new Person("spark", 21) {
      override def speak: Unit = {
        println(s"$name is speak")
      }
    }
    student2.speak
  }

  abstract class Person(val name: String, val age: Int) {
    def speak: Unit
  }

  class Student(name: String, age: Int) extends Person(name, age) {
    override def speak: Unit = {
      println(s"$name is speak")
    }
  }

}
