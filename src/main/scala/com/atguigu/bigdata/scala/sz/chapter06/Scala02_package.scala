package com.atguigu.bigdata.scala.sz.chapter06

package xxxx{

  import com.atguigu.bigdata.scala.sz.chapter06.xxxx.yyy.Test

  class Dept extends Test{
    private val dept = new Dept
    dept.test()
    println(dept.age)
    dept.email
  }
  package yyy{
    class Test{
      private var name:String = "zhangsan"
      def test()={
        println("test")
      }
      private[chapter06] var age:Int = 20
      protected var email:String = "xxxx@yyyyy"
      private val test1 = new Test
      test1.email
      test1.age
      test()


    }
    class Son extends Dept{
      private val son = new Son
      son.test()
      println(son.age)
      son.email
    }
    class Milk{
      private val test = new Test
      test.test()
      test.age
    }
  }
}
object Scala02_package {
  def main(args: Array[String]): Unit = {

  }
}
