package com.xk.bigdata.scala.collection

object ListApp {

  def main(args: Array[String]): Unit = {

    val list1 = List("spark", "hadoop", "flink", "kafka")
    // 返回列表第一个元素
    println(list1.head)
    // 返回一个列表，包含除了第一元素之外的其他元素
    println(list1.tail)
    // 判断是否为空
    println(list1.isEmpty)
    // 除最后一个元素以外的其他元素
    println(list1.init)
    // 用于将列表的顺序反转
    println(list1.reverse)
    // 删除列表数据
    println(list1.drop(1))
    // 直接使用加强的 For 循环
    for (els <- list1) {
      println(els)
    }
    // 把 List 转换成可迭代，然后进行迭代
    val iterator = list1.iterator
    while (iterator.hasNext) {
      println(iterator.next())
    }

    val listBuffer = scala.collection.mutable.ListBuffer[String]()
    listBuffer += "hadoop"
    listBuffer ++= List("spark", "flink")
    println(listBuffer)
  }

}
