package com.atguigu.bigdata.scala.sz.chapter06

object Scala19_Trait2 {

  def main(args: Array[String]): Unit = {
    val user = new User19
    user.insert()
    val user19 = new User199(new User19)
    user19.insert()
    user19.update()
  }
}
class User19{
  def insert()={
    println("insert...")
  }

}
class User199(user:User19){
  def insert()={
  user.insert()
}
  def update()={
    println("update...")
  }

}
