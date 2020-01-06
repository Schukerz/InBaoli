package com.atguigu.bigdata.scala.sz.chapter05

object Scala02_Function2 {
  def main(args: Array[String]): Unit = {
    f(1,2,4,5)

  def f(a:Int*): Unit ={
    println(a)
  }

    def f2(name:String)={
      var username = name
      if(name == null){
        username = "zhangsan"
      }
      println("name=" + username)

    }
    f2("lisi")
    f2(null)

    def f3(name:String = "zhangsan")={
      println(name)

    }
    f3()
    f3("hello")
    def f4( name:String){
      return "zhangsan"
    }
    println(f4("lisi"))

    def f5(){
      "zhangsan"
    }

    println(f5)

  }
}
