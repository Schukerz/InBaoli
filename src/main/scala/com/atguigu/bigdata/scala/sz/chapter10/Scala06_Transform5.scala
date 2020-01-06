package com.atguigu.bigdata.scala.sz.chapter10

import com.atguigu.bigdata.scala.sz.chapter10.Scala06_Transform5.User6


object Scala06_Transform5 extends TestXXX {
  def main(args: Array[String]): Unit = {
    val user = new User6
    user.insert()
    user.update()

  }

  class User6{
    def insert()={
      println("insert...")
    }
  }
}
trait TestXXX{}
object TestXXX{
  implicit class ExtUser6(user:User6){
    def update()={
      println("update...")
    }
  }
}
