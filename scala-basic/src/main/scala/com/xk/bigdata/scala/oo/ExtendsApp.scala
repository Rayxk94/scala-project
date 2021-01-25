package com.xk.bigdata.scala.oo

object ExtendsApp {

  def main(args: Array[String]): Unit = {
    val student = new Student("spark", 15, "A")
    student.eat()
    println(student.gender)
  }

  class Person(val name: String, val age: Int) {
    val gender = "M"

    def eat(): Unit = {
      println(s"Person Class $name........eat")
    }
  }

  class Student(name: String, age: Int, val school: String) extends Person(name, age) {

    override val gender: String = "L"

    override def eat(): Unit = {
      println(s"Student Class $name........eat")
    }
  }

}
