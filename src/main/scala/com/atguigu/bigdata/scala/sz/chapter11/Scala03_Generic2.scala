package com.atguigu.bigdata.scala.sz.chapter11

import com.atguigu.bigdata.scala.sz.chapter01.Scala05_Var._
object Scala03_Generic2 {
  def main(args: Array[String]): Unit = {
    def test(implicit name:String):Unit={
      println(name)
    }
    val str : String= implicitly[String]
    test(str)
  }

}
