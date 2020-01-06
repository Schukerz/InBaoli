package com.atguigu.bigdata.scala.sz.chapter10

object Scala01_Transform {
  def main(args: Array[String]): Unit = {
    implicit def tranform(d:Double):Int={
      d.toInt
    }
    val d:Int = 2.0
  }
}
