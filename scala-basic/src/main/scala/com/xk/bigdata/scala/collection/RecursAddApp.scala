package com.xk.bigdata.scala.collection

object RecursAddApp {

  def main(args: Array[String]): Unit = {
    println(sum(1, 2, 3, 4, 5))
  }

  def sum(nums: Int*): Int = {
    if (nums.length == 0) {
      0
    } else {
      nums.head + sum(nums.tail: _*)
    }
  }

}
