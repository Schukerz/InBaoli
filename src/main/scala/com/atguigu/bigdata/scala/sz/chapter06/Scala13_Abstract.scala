package com.atguigu.bigdata.scala.sz.chapter06

object Scala13_Abstract {
  def main(args: Array[String]): Unit = {
    val user1 = new User13
    user1.test()
    user1.test2()
  }
}
abstract class Parent13{
  def test():String = {
    "zhangsan"
  }
  def test2 : Unit
}

class User13 extends Parent13{
  override def test():String = {
  "lisi"
}
  def test2()={
    123
  }
}
