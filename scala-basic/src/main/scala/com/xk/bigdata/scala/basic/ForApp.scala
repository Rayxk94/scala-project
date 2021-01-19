package com.xk.bigdata.scala.basic

import scala.util.control.Breaks.{break, breakable}

/**
 * for循环使用
 * 需求1： 打印一个九九乘法表
 * 需求2： 打印10以内的奇数
 * 需求3：判度是否为质数，如果为质数则推出循环
 * 需求4： 把数组里面的数据通过for循环全部求平方并用另一个数组接收
 */
object ForApp {

  def main(args: Array[String]): Unit = {
    // for循环的基础使用
    val a = "abcd"
    for (els <- a) {
      println(els)
    }

    // 需求1： 打印一个九九乘法表
    for (i <- 1 to 9; j <- 1 to i) {
      print(s"$i*$j=${i * j}\t")
      if (i == j) {
        print("\n")
      }
    }

    // 需求2： 打印10以内的奇数
    for (i <- 1 to 10) {
      if (i % 2 != 0) {
        println(i)
      }
    }
    // 使用循环守卫
    for (i <- 1 to 10 if i % 2 != 0) {
      println(i)
    }

    // 需求3：判度是否为质数，如果为质数则推出循环
    // 使用break关键字
    val b = 7
    var flag = true
    breakable {
      for (i <- 2 until b) {
        if (b % i == 0) {
          flag = false
          break()
        }
      }
    }
    println(flag)

    // 需求4： 把数组里面的数据通过for循环全部求平方并用另一个数组接收
    val arry = (1 to 9).toArray[Int]
    val arryNew = for (els <- arry) yield els * els
    for (els <- arryNew) {
      println(els)
    }

  }

}
