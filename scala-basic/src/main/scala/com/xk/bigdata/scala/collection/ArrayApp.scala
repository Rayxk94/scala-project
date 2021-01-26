package com.xk.bigdata.scala.collection

object ArrayApp {

  def main(args: Array[String]): Unit = {
    val array1 = new Array[String](3)
    val array2 = Array("hadoop2", "spark2", "flink2")
    // 更新数据
    array1.update(0, "hadoop1")
    array1.update(1, "spark1")
    array1.update(2, "flink1")
    // mkString
    println(array1.mkString(","))
    // ++ array 相加
    (array1 ++ array2).foreach(println)
    array1.foreach(println)
    // union
    array1.union(array2).foreach(println)
    // 取第一个数据
    println(array1.head)
    // 数组的长度
    println(array1.length)
    println(array1.size)
    // 数组中的最大、最小、总和
    val array3 = Array(1, 2, 3, 4, 5, 6)
    println(array3.max)
    println(array3.min)
    println(array3.sum)
    // 数组反向
    array1.reverse.foreach(println)

    val arrayBuffer = scala.collection.mutable.ArrayBuffer[String]("hadoop", "spark", "flink")
    arrayBuffer.insert(0, "hbase")
    arrayBuffer += "spark1"
    arrayBuffer ++= Array("hadoop1")
    arrayBuffer.update(0, "hbase1")
    println(arrayBuffer.toArray)
    println(arrayBuffer)
  }

}
