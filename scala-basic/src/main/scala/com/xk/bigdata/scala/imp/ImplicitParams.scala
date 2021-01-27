package com.xk.bigdata.scala.imp

/**
 * 隐式参数
 * 需求：在含参方法中定义一个隐式参数，在调用的时候方法不需要传参数就可以直接使用该方法
 */
object ImplicitParams {

  def main(args: Array[String]): Unit = {
    implicit val x = "spark"
    speak
  }

  def speak(implicit name: String): Unit = {
    println(s"$name is speak")
  }

}