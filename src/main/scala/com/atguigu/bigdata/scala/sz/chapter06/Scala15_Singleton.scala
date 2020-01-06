package com.atguigu.bigdata.scala.sz.chapter06

object Scala15_Singleton {
  def main(args: Array[String]): Unit = {
    val user1: User15.type = User15
    println(user1)
  }
}
object User15{}
