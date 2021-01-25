package com.xk.bigdata.scala.oo

object TraitApp {

  def main(args: Array[String]): Unit = {
    val miUSB = new MiUSB
    println(miUSB.name)
    miUSB.plugIn
    miUSB.insert
    miUSB.working
  }

  trait USB {
    println("========USB======")
    val name: String

    def insert

    def working

    def pop
  }

  trait Logger {
    println("========Logger======")

    def loginfo
  }

  trait Socket {
    println("========Socket======")

    def plugIn
  }

  class MiUSB extends Logger with USB with Socket {
    override def loginfo: Unit = {
      println("loginfo=====>MiUSB")
    }

    override val name: String = "小米充电器"

    override def insert: Unit = {
      println("接入充电器")
    }

    override def working: Unit = {
      println("充电器开始工作")
    }

    override def pop: Unit = {
      println("充电完成，拔出！！")
    }

    override def plugIn: Unit = {
      println("插上插座")
    }
  }

}
