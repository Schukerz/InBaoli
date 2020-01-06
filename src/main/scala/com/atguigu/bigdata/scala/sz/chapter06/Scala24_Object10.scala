package com.atguigu.bigdata.scala.sz.chapter06

object Scala24_Object10 {
  def main(args: Array[String]): Unit = {
    val u1 = new User24()
    u1.id = 1

    val u2 = new User24()
    u2.id = 1
    println(u1.equals(u2))
    val unit: Class[User24] = classOf[User24]
    println(unit)
  }
}
class User24{
  var id:Int =_

  override def equals(obj: Any): Boolean = {
    if(!(obj.isInstanceOf[User24])){
      false
    }else{
      val user: User24 = obj.asInstanceOf[User24]
      user.id == this.id
    }
  }
}
