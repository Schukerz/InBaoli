package com.atguigu.bigdata.scala.sz.chapter06

import java.text.SimpleDateFormat
import java.util.{Calendar, Date}

object TestTime {

  def main(args: Array[String]): Unit = {
    val time1 = List(
      ( "anheqiao", 1549044122, 10.0 ),
      ( "shengbeilu", 1549044122, 32.0 ),
      ( "pinganjie", 1549044122,25.0 )
    )
    val time2 = List(
      ( "anheqiao", 1549044123, 13.0 ),
      ( "shengbeilu", 1549044123, 34.0 ),
      ( "pinganjie", 1549044123,27.0 )
    )
    val time3 = List(
      ( "anheqiao", 1549130522, 14.0 ),
      ( "shengbeilu", 1549130522, 33.0 ),
      ( "pinganjie", 1549130522,26.0 )
    )
    val time4 = List(
      ( "anheqiao", 1549130523, 11.0 ),
      ( "shengbeilu", 1549130523, 32.0 ),
      ( "pinganjie", 1549130523,23.0 )
    )

    //获取所有数据
    val list: List[List[(String, Int, Double)]] = time1::time2::time3::time4::Nil

    //把时间转换成日期的字符串格式
    val listWithDate: List[(String, String, Double)] = list.flatten.map(t=>(t._1,secondToDate(t._2),t._3))

    //根据日期和点位分组
    val tupleToTuples: Map[(String, String), List[(String, String, Double)]] = listWithDate.groupBy(t=>(t._1,t._2))
    //获取每天的平均值
    val groupToAvg: Map[(String, String), Double] = tupleToTuples.map(t=>(t._1,t._2.map(_._3))).map(t=>(t._1,t._2.sum/t._2.size))

    println(groupToAvg)

    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    val str: String = sdf.format(new Date((1549130523*1000L).toLong))
    println(str)





  }
  //把秒数转换成日期
  def secondToDate(seconds:Int):String={
          val i: Int = seconds/24/3600

          val calendar: Calendar = Calendar.getInstance()
          calendar.set(1970,0,1,0,0,0)
          calendar.add(Calendar.DATE,i)
          val time: Date = calendar.getTime
          val str: String = new SimpleDateFormat("yyyy-MM-dd").format(time)
//          println(str)
      str

  }


}
