package com.atguigu.bigdata.scala.sz.chapter06

object Scala05_Class1 {

  def main(args: Array[String]): Unit = {
val emp = new Emp1
    emp.test(    )
    emp.test("hello")
  }
}
class Emp1{
  var name:String = "zhangsan"
  def test()={
    println("test")
  }
  def test(s:String)={
    println(s)
  }
}
