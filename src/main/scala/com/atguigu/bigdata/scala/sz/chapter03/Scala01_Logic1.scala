package com.atguigu.bigdata.scala.sz.chapter03

object Scala01_Logic1 {
  def main(args: Array[String]): Unit = {

    val flag = true
    val age : Int = 20
    if(flag)
      println(age)
    println(flag)

    if(flag){
      println("flag=true")
    }else{
      println("flag=false")
    }
  }

}
