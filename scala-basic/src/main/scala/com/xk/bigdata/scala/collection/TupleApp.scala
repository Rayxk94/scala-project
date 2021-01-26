package com.xk.bigdata.scala.collection

object TupleApp {

  def main(args: Array[String]): Unit = {

    val tuple1 = (1, 2, "spark", "hadoop")
    val tuple2 = Tuple2(1, "spark")
    // 得到 Tuple 里面的第一条数据
    println(tuple1._1)
    val tuple3 = 0 -> "zero"
    println(tuple3)
    // Tuple 迭代
    // 1. 通过每个元素的索引得到数据
    for (i <- 0 until (tuple3.productArity)) {
      println(tuple3.productElement(i))
    }
    // 2. 通过把 Tuple 转换成迭代器
    for (els <- tuple3.productIterator) {
      println(els)
    }
  }

}
