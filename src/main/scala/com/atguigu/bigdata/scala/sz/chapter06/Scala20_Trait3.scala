package com.atguigu.bigdata.scala.sz.chapter06

object Scala20_Trait3 {
  def main(args: Array[String]): Unit = {
    val user = new User20() with Trait20
    user.insert()
    user.update()
  }
}
class User20{
  def insert()={
    println("insert...")
  }
}
trait Trait20{
  def update()={
    println("update...")
  }
}
