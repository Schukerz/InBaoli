package com.atguigu.bigdata.scala.sz.chapter01

import java.text.SimpleDateFormat
import java.util.Date

object Scala_FinalExam {
  def main(args: Array[String]): Unit = {
    // 需求：取得传感器上报数据，并统计出每一个传感器点位每天的平均水位
    val time1 = List(
      ( "anheqiao", 1549044122L, 10.0 ),
      ( "shengbeilu", 1549044122L, 32.0 ),
      ( "pinganjie", 1549044122L,25.0 )
    )
    val time2 = List(
      ( "anheqiao", 1549044123L, 13.0 ),
      ( "shengbeilu", 1549044123L, 34.0 ),
      ( "pinganjie", 1549044123L,27.0 )
    )
    val time3 = List(
      ( "anheqiao", 1549130522L, 14.0 ),
      ( "shengbeilu", 1549130522L, 33.0 ),
      ( "pinganjie", 1549130522L,26.0 )
    )
    val time4 = List(
      ( "anheqiao", 1549130523L, 11.0 ),
      ( "shengbeilu", 1549130523L, 32.0 ),
      ( "pinganjie", 1549130523L,23.0 )
    )
    val data = List(time1,time2,time3,time4)
    val datas: List[(String, Long, Double)] = data.flatMap(s=>s)
    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    val locationAndDateToMark: List[(String, Double)] = datas.map {
      case (location, time, mark) =>
        (location + "_" + sdf.format(new Date(time * 1000)), mark)
    }
//    println(locationAndDateToMark)
    val locationAndDateToList: List[(String, List[(String, Double)])] = locationAndDateToMark.groupBy(_._1).toList
//    println(locationAndDateToList)
    val locationToDateAndAvg: List[(String, (String, Double))] = locationAndDateToList.map {
      case (ld, list) =>
        val ldList: Array[String] = ld.split("_")
        (ldList(0), (ldList(1), list.map(_._2).sum / list.size))
    }
    val resultList: Map[String, List[(String, (String, Double))]] = locationToDateAndAvg.groupBy(_._1)
    val result: Map[String, List[(String, Double)]] = resultList.map {
      case (locaton, list) =>
        (locaton, list.map(_._2))
    }
//    result
    println(result)
  }

}
