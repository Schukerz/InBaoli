package com.atguigu.bigdata.scala.sz.chapter05

object Scala03_Function03_Nightware {
  def main(args: Array[String]): Unit = {
    def f1():String={
      "zhangsan"
    }
    def f2()={
      val flag=true
      if(flag){
        12
      }else{
        "zhangsan"
      }
    }

    def f3() = "zhangsan"
    def f4 = "zhangsan"
    def f5(){
      "zhangsan"
    }

    val f6 = ()=>{"zhangsan"}
    println(f6())

  }
}
