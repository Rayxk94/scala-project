package com.xk.bigdata.scala.generic

/**
 * 泛型类
 */
object GenericClass {

  def main(args: Array[String]): Unit = {
    val message = new Message(11)
    message.loginfo()
  }

  /**
   * 定义一个任意类型的 msg ,通过实例化的时候传入
   */
  class Message[T](val msg: T) {
    def loginfo(): Unit = {
      println("=========>" + msg)
    }
  }

}