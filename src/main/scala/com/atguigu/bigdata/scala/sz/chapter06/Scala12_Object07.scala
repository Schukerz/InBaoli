package com.atguigu.bigdata.scala.sz.chapter06

object Scala12_Object07 {
  def main(args: Array[String]): Unit = {
    new User12()
    //初始化的时候,根据是否传参,先走子类对应的构造器,只是还没走完,先在内存中开辟空间,然后先调用父类的构造器,等父类的构造器走完再继续走子类的构造器
  }
}
class Parent12(){
  println("1111")
  def this(name:String){
    this()
    println("2222")
  }
}
class User12(name:String) extends Parent12(name){
  println("3333")
  def this(){
    this("xxxx")
    println("4444")
  }
}
