package com.atguigu.bigdata.scala.sz.chapter06

object Scala07_Object2 {
  def main(args: Array[String]): Unit = {
    val user0 = new User07
    println(user0.name)
    println(new User07("lisi").name)
    println(new User07("wangwu", 22))
  }
}
class User07(){
  var name:String = "zhangsan"
  def this(s:String)={
    this()
    name=s
  }
  def this(s:String,age:Int)={
    this(s)

  }
}
