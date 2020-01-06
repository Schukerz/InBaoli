package com.atguigu.bigdata.scala.sz.chapter06

object Scala18_Trait1 {
  def main(args: Array[String]): Unit = {
    val user1 = new User18
    println(user1.pname)
    user1.test()
    user1.test2()
  }
}
class Parent18{
  var pname:String = "parent"
}
class User18 extends Trait18{
  override def test(): Int = 11
}
trait Trait18 extends Parent18{
  var age:Int = _
  def test():Int
  def test2():String = {"zhangsan"}
}
