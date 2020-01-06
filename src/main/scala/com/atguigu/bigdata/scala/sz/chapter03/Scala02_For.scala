package com.atguigu.bigdata.scala.sz.chapter03

object Scala02_For {
  def main(args: Array[String]): Unit = {
    val res = for(i <-1 to 10) yield 2*i
    println(res)
    for(i<- 1 to 4 reverse){
      println(i)
    }
  }

}
