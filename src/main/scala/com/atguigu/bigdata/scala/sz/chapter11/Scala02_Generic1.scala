package com.atguigu.bigdata.scala.sz.chapter11

object Scala02_Generic1 {
  def main(args: Array[String]): Unit = {

//    val unit : Person[User] = new Person[Parent]()
//    val unit : Person[User] = new Person[Child]()

//    test(new User)
////    test(new Parent())
//    test(new Child())
//
//    test1(new User)
//    test1(new Parent)
//    test1(new Child)

    def test[T <: User](t:T)={
      println(t)
    }
    def test1[T>:User](t:T)={
      println(t)
    }

//    println(new Person[Parent])
//    println(new Person[User])
//    println(new Person[Child]) //error

//    println(new Person1[Parent])
    println(new Person1[User])
    println(new Person1[Child])


  }
}
class Person[T>:User]{

}
class Person1[T<:User]{

}
