package com.xk.bigdata.scala.function

/**
 * 自定义实现常用函数 ：filter
 * 使用 filter 算子把 array 中大于3的数据全部取出来
 */
object CustomFilterFun {

  def customFilter(array: Array[Int])(op: (Int) => Boolean): Array[Int] = {
    for (els <- array if op(els)) yield els
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5)
    // 使用 filter 算子把 array 中大于3的数据全部取出来
    array.filter(_ > 3).foreach(println)
    customFilter(array)(_ > 3).foreach(println)
  }

}
