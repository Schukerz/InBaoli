package com.atguigu.bigdata.scala.sz.chapter05

object Scala07_Function7_Abstract {
  def main(args: Array[String]): Unit = {

    def f = ()=>{
      println("f..")
      10
    }
    def foo(a: =>Int)={
      println(a)
      println(a)
    }
    foo(f())
  }
}
