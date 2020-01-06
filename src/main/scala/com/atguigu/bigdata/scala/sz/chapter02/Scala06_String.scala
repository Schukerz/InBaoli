package com.atguigu.bigdata.scala.sz.chapter02

object Scala06_String {
  def main(args: Array[String]): Unit = {
    val name:String = "zhangsan"
    val age:Int=20

    println("name = $name")
    println(s"name=${name.toUpperCase()}\n"+s"age=$age")
    println(
      s"""
         |select *
         |from
         |table1
         |where id < 10
       """.stripMargin
    )
    printf("name=%s,age=%d",name,age)
  }

}
