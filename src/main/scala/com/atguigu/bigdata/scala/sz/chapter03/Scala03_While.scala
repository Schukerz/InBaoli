package com.atguigu.bigdata.scala.sz.chapter03

import scala.util.control.Breaks._

object Scala03_While {
  def main(args: Array[String]): Unit = {
    //    *
    //   ***
    //  *****
    // *******
    // 九层妖塔
    for(i <- new Range(1,9,2);j=(7-i)/2){
      println(" "*j + "*"*i)
    }
    breakable{
      var num = 0
      while(true){
        num = num + 1
        println(num)
        if(num == 3){
          break
        }
      }
    }
  }

}
