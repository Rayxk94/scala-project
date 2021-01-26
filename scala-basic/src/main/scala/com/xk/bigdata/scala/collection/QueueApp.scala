package com.xk.bigdata.scala.collection

import scala.collection.mutable

object QueueApp {

  def main(args: Array[String]): Unit = {

    val queue1 = scala.collection.immutable.Queue[Int](2, 3, 4, 5, 5)
    println(queue1)
    val queue2 = new mutable.Queue[Int]()
    // 添加元素
    queue2.enqueue(2, 3, 4, 5, 6)
    println(queue2)
    // 取出数据
    queue2.dequeue()
    println(queue2)
    // 取第一个元素
    queue2.head
    println(queue2)
    // 取出除第一条以外的数据
    println(queue2.tail)
  }

}
