package com.atguigu.bigdata.scala.sz.chapter10

object Scala05_Transform4 {
  def main(args: Array[String]): Unit = {
    val user = new User
    user.insert()
    user.update()
  }
class User{
  def insert()={
    println("insert...")
  }
}
  implicit class ExtUser(user:User){
    def update()={
      println("update..")
    }
  }
}
