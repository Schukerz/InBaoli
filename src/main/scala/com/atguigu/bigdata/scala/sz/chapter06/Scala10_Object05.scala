package com.atguigu.bigdata.scala.sz.chapter06

object Scala10_Object05 {
  def main(args: Array[String]): Unit = {
    val e = new Emp10
    println(Emp10.newInstance())

  }
}
class Emp10{
  private var name:String = "zhangsan"
}
object Emp10{
  def newInstance()={
    val emp1 = new Emp10
    emp1.name="lisi"
    println(emp1.name)
    emp1
  }
}
