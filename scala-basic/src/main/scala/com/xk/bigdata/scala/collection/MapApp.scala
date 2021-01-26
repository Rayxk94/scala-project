package com.xk.bigdata.scala.collection

object MapApp {

  def main(args: Array[String]): Unit = {

    val map1 = Map("hadoop" -> 21, "spark" -> 22)
    // 得到 Map 里面的数据
    println(map1.getOrElse("hadoop", 0))
    println(map1.getOrElse("hadoop1", 0))
    // 得到 Map 里面的 所有的key
    map1.keys.foreach(println)
    // 得到Map里面所有的Value
    map1.values.foreach(println)
    // 遍历Map
    for (key <- map1.keys) {
      println(s"key==============>$key")
      val value = map1.getOrElse(key, 0)
      println(s"value=============>$value")
    }
    for (key <- map1.keySet) {
      println(s"key==============>$key")
      val value = map1.getOrElse(key, 0)
      println(s"value=============>$value")
    }

    val map2 = scala.collection.mutable.Map[String, Int]()
    // 插入数据
    map2.put("hbase", 20)
    map2 += "flink" -> 21
    map2 ++= Map("kafka" -> 25)
    println(map2)
  }

}
