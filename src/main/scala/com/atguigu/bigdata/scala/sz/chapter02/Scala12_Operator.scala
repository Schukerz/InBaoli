package com.atguigu.bigdata.scala.sz.chapter02

object Scala12_Operator {
  def main(args: Array[String]): Unit = {
    val s1 = new String("ss")
    val s2 = new String("ss")
    println(s1 == s2)
    println(s1.eq(s2))

    val o1 = new Object()
    val o2 = new Object()
    println(o1 == o2)
    println(o1.eq(o2))
  }
}
