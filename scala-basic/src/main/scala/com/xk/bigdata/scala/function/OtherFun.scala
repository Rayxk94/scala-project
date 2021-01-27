package com.xk.bigdata.scala.function

object OtherFun {

  def main(args: Array[String]): Unit = {

    val array = Array("spark,hbase", "spark,hadoop", "spark,hadoop", "kafka")
    // flatten : 压平函数
    array.flatten.foreach(println)
    // flatMap 算子 ： 需要把 array 里面的数据按照 逗号 分隔符分割
    // 使用 flatten + map 算子
    array.map(_.split(",")).flatten.foreach(println)
    // 使用 flatMap 算子
    val words = array.flatMap(_.split(","))
    // groupBy 按照某个字段分组: 把上面压扁的函数按照 key 进行排序
    // scala.collection.immutable.Map[String,Array[(String, Int)]] = Map(hadoop -> Array((hadoop,1)), spark -> Array((spark,1), (spark,1)), hbase -> Array((hbase,1)))
    val groupBy = words.map((_, 1)).groupBy(_._1)
    // mapValues 对 value 进行操作 : 计算出 value 中的所有数据数量
    // sortBy 按照 value 进行从大到小排序
    // take: 得到前两条数据
    groupBy.mapValues(_.size).toArray.sortBy(-_._2).take(2).foreach(println)
  }

}
