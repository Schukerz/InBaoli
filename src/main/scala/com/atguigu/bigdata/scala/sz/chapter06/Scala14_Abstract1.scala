package com.atguigu.bigdata.scala.sz.chapter06

object Scala14_Abstract1 {
  def main(args: Array[String]): Unit = {


    val user2:User14 = new User14
    val parent:Parent14 = user2
    println(parent)//这个调用的是toString方法,是个成员方法,根据动态绑定的机制会调用具体对象的方法,也就是user的方法

  }
}
abstract class Parent14{
  val name:String = "zhangsan"
  var age:Int
  def test()={
    println("hello")
  }
}
class User14 extends Parent14{
  override  val name:String = "lisi"
  var age : Int = 12
  def hi()={

  }

}
