package com.atguigu.bigdata.scala.sz.chapter10

object Scala02_Transform1 {
  def main(args: Array[String]): Unit = {
    implicit def tranform(user:User):ExtUser={
      new ExtUser()
    }

    val user: User = new User
    user.insert()
    user.update()
  }
}
class User{
  def insert()={
    println("insert...")
  }

}
class ExtUser{
  def update()={
    println("update..")
  }
}
