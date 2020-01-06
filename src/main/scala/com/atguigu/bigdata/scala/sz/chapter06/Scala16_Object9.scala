package com.atguigu.bigdata.scala.sz.chapter06

object Scala16_Object9 {
  def main(args: Array[String]): Unit = {
    val user1 = User16()
    val date = User16("2019-12-12")
    println(date)
    val user2 = User16(12)
    println(user2)

  }
}
class User16(age:Int = 14){
  println(age)
}
object User16{
  def apply(): User16 = new User16()
  def apply(age:Int)=new User16(age)
  def apply(date:String)={
    import _root_.java.text.SimpleDateFormat
    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    sdf.parse(date)
  }
}
