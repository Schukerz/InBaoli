package com.atguigu.bigdata.scala.sz.chapter02

object Scala09_DataType1 {
  def main(args: Array[String]): Unit = {
    val b:Byte = 128.toByte
    val i:Int=2
    val c:Char = 's'
    val flag:Boolean = false
    val d = 10.0f
    val l = 10L
    println(b)
    println(c + 1)
//    val c2 :Char = c+1
//    println(c2)
    println("----------------")
    val i1 = 1
    val ss = "zhangsan"
    val hello: Int = ss.toInt
    println(hello)//NumberFormatException
  }
}
