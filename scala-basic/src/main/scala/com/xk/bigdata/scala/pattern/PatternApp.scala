package com.xk.bigdata.scala.pattern

import scala.io.Source

object PatternApp {

  def main(args: Array[String]): Unit = {

    // 普通模式匹配
    judgeGrade1("A")
    judgeGrade1("B")
    judgeGrade1("E")

    // 模式匹配中增加 if 条件
    judgeGrade2("A", "hadoop")
    judgeGrade2("E", "spark")

    // 模式匹配中匹配数组里面的数据
    judgeFriend1(Array("spark"))
    judgeFriend1(Array("spark", "hadoop"))
    judgeFriend1(Array("flink", "hadoop"))
    judgeFriend1(Array("flink", "hadoop", "spark"))

    // 模式匹配 List 里面的数据
    judgeFriend2(List("spark"))
    judgeFriend2(List("spark", "hadoop"))
    judgeFriend2(List("flink", "hadoop"))
    judgeFriend2(List("flink", "hadoop", "spark"))

    // 模式匹配数据类型
    judgeDataType("data")
    judgeDataType(1)
    judgeDataType(Map("spark" -> 21))
    judgeDataType(List("Spark"))
    judgeDataType(1L)

    // 模式匹配判断 class
    judgeClass(Person("spark"))
    judgeClass(Student(21))
    judgeClass(1)

    // 模式匹配在 try catch 中的使用
    tryCatch()

  }

  /**
   * 普通模式匹配
   */
  def judgeGrade1(grade: String): Unit = {
    grade match {
      case "A" => println("很好！！")
      case "B" => println("还不错！！")
      case "C" => println("需要加油了！！")
      case _ => println("其他分数!!")
    }
  }

  /**
   * 模式匹配中增加 if 条件
   */
  def judgeGrade2(grade: String, name: String): Unit = {
    grade match {
      case "A" => println("很好！！")
      case "B" => println("还不错！！")
      case _ if (name == "spark") => println(s"$name 还可以！！")
      case _ => println("其他的！！")
    }
  }

  /**
   * 模式匹配中匹配数组里面的数据
   */
  def judgeFriend1(array: Array[String]): Unit = {
    array match {
      case Array("spark") => println("Hi spark")
      case Array("spark", _*) => println("Hi spark and friends")
      case Array(x, y) => println(s"Hi ,$x==>$y")
      case _ => println("大家好")
    }
  }

  /**
   * 模式匹配 List 里面的数据
   */
  def judgeFriend2(list: List[String]): Unit = {
    list match {
      case "spark" :: Nil => println("Hi spark")
      case "spark" :: tail => println("Hi spark and friends")
      case List(x, y) => println(s"Hi ,$x==>$y")
      case _ => println("大家好")
    }
  }

  /**
   * 模式匹配数据类型
   */
  def judgeDataType(data: Any): Unit = {
    data match {
      case i: Int => println("Int")
      case s: String => println("String")
      case map: Map[_, _] => println("map")
      case list: List[_] => println("list")
      case _ => println("其他类型")
    }
  }

  def judgeClass(obj: Any): Unit = {
    obj match {
      case Person(name) => println(s"Person=======>$name")
      case Student(age) => println(s"Student=========>$age")
      case _ => println("other...")
    }
  }

  case class Person(name: String)

  case class Student(age: Int)

  /**
   * try catch
   */
  def tryCatch(): Unit = {
    try {
      1 / 0
      Source.fromFile("data/demo.txt")
    } catch {
      case e: ArithmeticException => println(s"计算异常：${e.getMessage}")
      case e: Exception => println(s"${e.getMessage}")
    }

  }
}