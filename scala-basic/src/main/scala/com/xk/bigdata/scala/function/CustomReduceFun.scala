package com.xk.bigdata.scala.function

/**
 * 自定义实现常用函数 ：reduce
 * 使用 reduce 把 array 中的数据全部相加一起
 */
object CustomReduceFun {

  def customReduce(array: Array[Int])(op: (Int, Int) => Int): Int = {
    var last = array(0)
    for (i <- 1 until (array.length)) {
      last = op(last, array(i))
    }
    last
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5)
    // 使用 reduce 把 array 中的数据全部相加一起
    println(array.reduce((a, b) => {
      println(s"a:${a}=====>b:$b")
      a + b
    }))
    println(customReduce(array)((a, b) => {
      println(s"a:${a}=====>b:$b")
      a + b
    }))
  }

}
