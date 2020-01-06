package com.atguigu.bigdata.scala.sz.chapter06

object Scala11_Object06 {
  def main(args: Array[String]): Unit = {
    new User11("hello")
  }
}
class Parent11(name:String){
  println(name)
}
class User11(name:String) extends Parent11(name) {

}