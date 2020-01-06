package com.atguigu.bigdata.scala.sz.chapter05

object Scala05_Product {
  def main(args: Array[String]): Unit = {
    def test(num:Int):Int={
      if(num == 1){
        1
      }else{
        num * test(num-1)
      }
    }

    println(test(5))
    def test2(num:Int,result:Int):Int={
      if(num == 1){
        result
      }else{
        test2(num-1,result+num)
      }
    }

    println(test2(4, 1))
  }
}
