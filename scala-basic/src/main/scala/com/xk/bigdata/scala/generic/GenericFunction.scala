package com.xk.bigdata.scala.generic

/**
 * 定义泛型方法
 */
object GenericFunction {

  def main(args: Array[String]): Unit = {
    GenericFunctionTest().logingo("111")
    GenericFunctionTest().logingo(2222)
    GenericFunctionTest().logingo(3333L)
  }

  class GenericFunctionTest() {

    def logingo[T](msg: T): Unit = {
      println("=========>" + msg)
    }

  }

  object GenericFunctionTest {
    def apply(): GenericFunctionTest = new GenericFunctionTest()
  }

}