package com.xk.bigdata.scala.read

import java.io.{BufferedReader, InputStreamReader}
import java.util.Scanner

import scala.io.StdIn

/**
 * 读取控制台数据
 * 1. Java 读取控制台数据（字节流）
 * 2. Java 封装的读取控制台数据
 * 3. Scala 读取控制台数据
 */
object ReadConsole {

  def main(args: Array[String]): Unit = {

    // Java 读取控制台数据（字节流）
    val reader = new BufferedReader(new InputStreamReader(System.in))
    val data1 = reader.readLine()
    println(s"==========>$data1")

    // Java 封装的读取控制台数据
    val scanner = new Scanner(System.in)
    val data2 = scanner.next()
    println(s"==========>$data2")

    // Scala 读取控制台数据
    val data3 = StdIn.readLine()
    println(s"==========>$data3")

  }

}