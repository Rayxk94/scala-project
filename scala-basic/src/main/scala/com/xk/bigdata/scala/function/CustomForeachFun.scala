package com.xk.bigdata.scala.function

/**
 * 自定义实现常用函数 ：foreach
 * 使用 foreach 算子把 array 中的数据全部打印出来
 */
object CustomForeachFun {

  def customForeach(array: Array[Int])(op: (Int) => Unit): Unit = {
    for (els <- array) op(els)
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5)
    // 使用 foreach 算子把 array 中的数据全部打印出来
    array.foreach(println)
    customForeach(array)(println)
  }

}