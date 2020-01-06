package com.atguigu.bigdata.scala.sz.chapter06

object Scala25_Object11_Enum {
  def main(args: Array[String]): Unit = {
    println(Color.RED)
  }
}
object Color  extends Enumeration{
  val RED = Value(1,"red")
  val BLUE=Value(2,"blue")
  val YELLOW=Value(3,"yellow")
}
object MyApp extends App{
  println("myapp")
}
