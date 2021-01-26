package com.xk.bigdata.scala.function

/**
 * 自定义实现常用函数 ：Map
 * 使用 map 算子把 array 中的数据全部 * 2
 */
object CustomMapFun {

  def customMap(array: Array[Int])(op: (Int) => Int): Array[Int] = {
    for (els <- array) yield op(els)
  }

  def main(args: Array[String]): Unit = {
    val array = Array(1, 2, 3, 4, 5)
    // 使用 map 算子把 array 中的数据全部 * 2
    array.map(_ * 2).foreach(println)
    customMap(array)(_ * 2).foreach(println)
  }

}
