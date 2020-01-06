package com.atguigu.bigdata.scala.sz.chapter10

object Scala03_Transform2 {
  def main(args: Array[String]): Unit = {
    implicit def test(D:Double)={
      D.toInt
    }
//    implicit def test1(d:Double)={
//      d.toInt
//    }
    var i : Int = 2.0
  }
}
