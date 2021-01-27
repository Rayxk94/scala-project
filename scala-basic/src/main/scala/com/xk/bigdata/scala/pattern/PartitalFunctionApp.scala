package com.xk.bigdata.scala.pattern

object PartitalFunctionApp {

  def main(args: Array[String]): Unit = {

    println(judgeGrade("A"))
    println(judgeGrade("B"))
    println(judgeGrade("E"))

    // 需求：对集合中的数值类型 * 10
    // 第一步：判断集合里面的数据是否是 Int 类型
    // 第二步：把数据转换成 Int 类型
    // 第三步：把数据 * 10
    val list = List(1, 2, 3, 4, 5, "hadoop", "spark")
    // 第一个版本
    val pair1 = new PartialFunction[Any, Int] {
      override def isDefinedAt(x: Any): Boolean = {
        x.isInstanceOf[Int]
      }

      override def apply(v1: Any): Int = {
        v1.asInstanceOf[Int] * 10
      }
    }
    list.collect(pair1).foreach(println)

    // 第二个版本
    val pair2: PartialFunction[Any, Int] = {
      case i: Int => i * 10
    }
    list.collect(pair2).foreach(println)

    // 第三版本
    list.collect({
      case i: Int => i * 10
    }).foreach(println)

    // 第四版本
    list.collect {
      case i: Int => i * 10
    }.foreach(println)
  }

  def judgeGrade: PartialFunction[String, String] = {
    case "A" => "很好！！"
    case "B" => "还不错！！"
    case "C" => "需要加油了！！"
    case _ => "其他分数!!"
  }

}