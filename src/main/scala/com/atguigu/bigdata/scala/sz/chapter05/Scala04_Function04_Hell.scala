package com.atguigu.bigdata.scala.sz.chapter05

object Scala04_Function04_Hell {
  def main(args: Array[String]): Unit = {
//    def f2() = {
//
//    }
////    val f :()=>Unit = f2
////    println(f())
//    val f = f2 _
//    println(f)
//    println(f())
//    println("-------------------------------")
//    def f1 (f:(Int,Int)=>Int) = {
//      f(20,50)
//    }
//    def f11(x:Int,y:Int)={
//      x+y
//    }
//
//    println(f1(f11))
//    println(f1((x:Int,y:Int)=>{x+y}))
//
//    f1((x,y)=>{x+y})
//    f1((x,y)=>x+y)
//    println(f1(_+_))

//    def f(s:String) = {
//      println("zhangsan")
//    }
//
//    def f1()={
//      f _
//    }
//    f1()("hello")
//
//    def test() ={
//      def f()={
//        println("f...")
//
//      }
//      f _
//    }
//    test()()

//    def test(i:Int,j:Int,f:(Int,Int)=>Int)={
//      f(i,j)
//    }
//    println(test(1,2,_+_))

    def test(i:Int)={
      def f1(j:Int)={
        def f2(f3:(Int,Int)=>Int)={
          f3(i,j)
        }
        f2 _
      }
      f1 _
    }

    println(test(1)(2)(_ + _))

    def f(i : Int)={
      def ff()={
        i+1
      }
      ff _
    }

    println(f(1)())

  }
}
