package com.atguigu.bigdata.scala.sz.chapter10

object Scala04_Transform3 {
  def main(args: Array[String]): Unit = {
    def regUser(implicit password:String = "123123")={
      println("insert User("+password+")")
    }
    implicit val password:String = "00000"
    regUser

    val ints = List(1,2,3,4)
    val list1: List[Int] = ints.sortBy(s=>s)(Ordering.Int.reverse)
    println(list1)

  }
}
