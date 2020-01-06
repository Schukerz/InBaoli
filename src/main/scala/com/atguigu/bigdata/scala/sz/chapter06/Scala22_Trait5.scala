package com.atguigu.bigdata.scala.sz.chapter06

object Scala22_Trait5 {
  def main(args: Array[String]): Unit = {
    new User22
  }
}
trait trait22{
  println("22..")
}
trait trait222 extends trait22{
  println("222")
}
trait trait2222 extends trait22{
  println("2222")
}
class User22 extends trait2222 with trait222{
  println("User22")
}
