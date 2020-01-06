package com.atguigu.bigdata.scala.sz.chapter02

import scala.io.StdIn

object Scala07_In {
  def main(args: Array[String]): Unit = {
    println("enter an integer")
    val age: Int = StdIn.readInt()
    println(age + 10)
  }

}
