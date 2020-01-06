package com.atguigu.bigdata.scala.sz.chapter06

object Scala01_Object {
  def main(args: Array[String]): Unit = {
    val user = new User
    val name: String = user.name
    println(user.name)
    user.login()
  }

}
class User{
  var name:String = "zhangsan"
  def login():Boolean={
    true
  }
}
