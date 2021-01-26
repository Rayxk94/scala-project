package com.xk.bigdata.scala.collection

object SetApp {

  def main(args: Array[String]): Unit = {

    val set1 = Set("spark", "spark", "spark1")
    val set2 = Seq(1, 23, 4, 64, 34)
    // 取最大、最下、总和数据
    println(set2.max)
    println(set2.min)
    println(set2.sum)

    val set3 = scala.collection.mutable.Set(1, 23, 34)
    // 添加数据
    set3.add(2)
    set3 += 4
    set3 ++= Set(3, 5, 7)
    // 删除数据
    set3.remove(1)
    set3 -= 2
    set3 --= Set(3, 5, 7)
    println(set3)
    // head
    println(set3.head)
    // tail
    println(set3.tail)
    // 判断是否为空
    println(set3.isEmpty)
    // 两个集合交集
    val set4 = Set(1,2,3,4)
    println(set3.intersect(set4))
    println(set3.&(set4))
  }

}
