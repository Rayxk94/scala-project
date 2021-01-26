package com.xk.bigdata.scala.function

object FunctionBasic {

  def main(args: Array[String]): Unit = {

    // 定义一个函数
    // 定义方式一： val/var 函数名称 = (输入参数列表) => {函数体}
    val f1 = (a: Int, b: Int) => a + b
    println(f1(1, 2))

    // 定义一个相加的方法
    def add(a: Int, b: Int): Int = a + b

    // 把方法赋予给一个变量
    val addFun = add _
    println(addFun(2, 4))
    // 定义方式二： val/var 函数名称:(输入参数类型) => 返回值类型 = (输入参数的引用) => {函数体}
    val f2: (Int, Int) => Int = add
    println(f2(4, 5))

    // 高阶函数
    def f3(op: ((Int, Int) => Int)) = {
      op(2, 3)
    }

    println(f3((a, b) => {
      a + b
    }))

    // 柯里化函数
    def f4(a: Int, b: Int)(op: ((Int, Int) => Int)) = {
      op(a, b)
    }

    println(f4(4, 20)((a, b) => {
      a + b
    }))

  }

}
