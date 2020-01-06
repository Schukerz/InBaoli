package com.atguigu.bigdata.scala.sz.chapter11

object Scala_Generic {
  def main(args: Array[String]): Unit = {
//    val test :Test[User] = new Test[Parent]
    val test1 :Test[User] = new Test[Child]
    val test2 :Test[User] = new Test[User]
    println(test1)
    println(test2)
  }
}
class User extends Parent{

}
class Parent{

}
class Child extends User{

}
class Test[+T]{

}
