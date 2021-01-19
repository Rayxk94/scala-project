package com.xk.bigdata.scala.basic

/**
 * 方法的基本使用
 */
object FunctionApp {

  /**
   * 需求： 定义一个两个数相加的方法
   */
  def add1(a: Int, b: Int): Int = {
    a + b
  }

  /**
   * 需求： 定义一个两个数相加的方法（简写）
   */
  def add2(a: Int, b: Int) = a + b

  def printHello(): Unit = {
    println("Hello World")
  }

  /**
   * 默认参数
   */
  def max(a: Int = 10, b: Int = 10) = {
    if (a > b) {
      a
    } else {
      b
    }
  }

  /**
   * 命名参数：求速率：路程/时间
   */
  def speed(distance: Float, time: Float) = distance / time

  /**
   * 变长参数-可变参数： 不确定有多少个入参
   */
  def add(nums: Int*) = {
    var result = 0
    for (num <- nums) {
      result += num
    }
    result
  }

  def main(args: Array[String]): Unit = {
    // 需求： 定义一个两个数相加的方法
    println(add1(1, 2))
    println(add2(2, 3))
    printHello
    // 默认参数
    println(max())
    // 命名参数
    println(speed(time = 10F, distance = 100F))
    // 变长参数
    println(add(1, 2, 3, 4))
  }

}
