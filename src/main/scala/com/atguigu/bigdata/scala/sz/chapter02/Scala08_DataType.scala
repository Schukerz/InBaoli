package com.atguigu.bigdata.scala.sz.chapter02

object Scala08_DataType {
  def main(args: Array[String]): Unit = {
//    val i: Int = null
    val s:String  = null
    val list: List[Nothing] = List()
    println(list)

    test()
    test1()
  }
  def test()={
    throw new Exception
  }
  def test1()={

  }
}
