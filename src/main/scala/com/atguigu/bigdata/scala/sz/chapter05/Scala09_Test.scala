package com.atguigu.bigdata.scala.sz.chapter05

object Scala09_Test {
  def main(args: Array[String]): Unit = {
    def f(i:Int)(j:Int)(f:(Int,Int)=>Int)={
      f(i,j)
    }

    println(f(10)(20)(_ + _))
  }

}
