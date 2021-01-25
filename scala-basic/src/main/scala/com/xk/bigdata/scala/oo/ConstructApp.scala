package com.xk.bigdata.scala.oo

object ConstructApp {

  def main(args: Array[String]): Unit = {
    val person = new Person("hadoop", 21, "A")
    println(person.school)
  }

  class Person(val name: String, val age: Int) {
    var school: String = _

    def this(name: String, age: Int, school: String) {
      this(name, age)
      this.school = school
    }
  }

}