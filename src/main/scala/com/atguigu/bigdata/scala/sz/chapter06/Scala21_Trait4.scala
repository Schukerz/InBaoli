package com.atguigu.bigdata.scala.sz.chapter06

object Scala21_Trait4 {

  def main(args: Array[String]): Unit = {
    new User21
  }
}

trait trait21{
  println("21..")
}
trait trait211 extends trait21 {
  println("211..")
}
class Parent21 extends trait21{
  println("parent21..")
}
class User21 extends Parent21 with trait211{
  println("user21..")
}