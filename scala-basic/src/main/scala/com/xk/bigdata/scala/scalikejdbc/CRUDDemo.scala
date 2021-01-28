package com.xk.bigdata.scala.scalikejdbc

import scalikejdbc.{DB, SQL}
import scalikejdbc.config.DBs

/**
 * 1. 插入数据
 * 2. 查询数据
 * 3. 删除数据
 * 4. 通过事务进行插入两条数据
 */
object CRUDDemo {

  /**
   * 插入数据
   */
  def insert(): Unit = {
    DB.autoCommit(implicit session => {
      SQL("insert into tes1t (id,name) values(?,?)")
        .bind(10, "10")
        .update()
        .apply()
    })
  }

  /**
   * 查询数据
   */
  def query(): Unit = {
    DB.readOnly(implicit session => {
      val data = SQL("select * from tes1t")
        .map(rs => {
          tes1t(rs.int("id"), rs.string("name"))
        }).toList().apply()
      data.foreach(println)
    })
  }

  /**
   * 删除数据
   */
  def delete(): Unit = {
    DB.autoCommit(implicit session => {
      SQL("delete from tes1t where id = ?")
        .bind(10)
        .update()
        .apply()
    })
  }

  /**
   * 通过事务进行插入两条数据
   */
  def transaction(): Unit = {
    DB.localTx(implicit session => {
      SQL("insert into tes1t (id,name) values(?,?)")
        .bind(11, "11")
        .update()
        .apply()
      SQL("insert into tes1t (id,name) values(?,?)")
        .bind(12, "12")
        .update()
        .apply()
    })
  }

  def main(args: Array[String]): Unit = {
    // 开启 Scalikejdbc，以及加载配置文件
    DBs.setupAll()
    // 插入数据
    insert()
    // 查询数据
    query()
    // 删除数据
    delete()
    // 通过事务进行插入两条数据
    transaction()
  }

  case class tes1t(id: Int, name: String)

}
