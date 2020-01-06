package com.atguigu.bigdata.scala.sz.chapter06

object Scala04_Class {
  def main(args: Array[String]): Unit = {
    val emp = new Emp
    println(emp.id)
  }
}
class Emp{

  var id:Int = _
  private var name:String = "zhangsan"

}
