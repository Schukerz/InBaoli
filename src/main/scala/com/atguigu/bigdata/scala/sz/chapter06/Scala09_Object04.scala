package com.atguigu.bigdata.scala.sz.chapter06

object Scala09_Object04 {
  def main(args: Array[String]): Unit = {
    val jenny = new User09("Jenny")
    println(jenny.name)
  }
}
class User09(var name:String){}
