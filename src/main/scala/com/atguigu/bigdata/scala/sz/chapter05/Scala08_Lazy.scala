package com.atguigu.bigdata.scala.sz.chapter05

object Scala08_Lazy {

  def main(args: Array[String]): Unit = {
    lazy val res = sum(1,2)
    println("------")
    println(res)
    def sum(i:Int,j:Int)={
      println("sum")
      i+j
    }
  }
}
