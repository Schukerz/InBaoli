package com.atguigu.bigdata.scala.sz.chapter01

import java.text.SimpleDateFormat
import java.util.Date

object Scala_FinalExam2 {
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
    //获取原始数据
    val oriData: List[List[(String, Long, Double)]] = List(time1,time2,time3,time4)
    val datas: List[(String, Long, Double)] = oriData.flatMap(list=>list)

    //转换时间为日期
    val sdf: SimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd")
    val addressAndDateToWMList: List[(String, Double)] = datas.map {
      case (address, time, watermark) => {
        val date: String = sdf.format(new Date(time * 1000))
        (address + "_" + date, watermark)

      }
    }
    //分组聚合
    val addressAndDateToWM: Map[String, List[(String, Double)]] = addressAndDateToWMList.groupBy(_._1)

    //转换并获取平均值
    val addressToDateAndAvg: List[(String, (String, Double))] = addressAndDateToWM.toList.map {
      case (keys, watermark) => {
        val key: Array[String] = keys.split("_")
        val values: List[Double] = watermark.map(_._2)
        (key(0), (key(1), values.sum / values.size))
      }
    }
    //分组
    val result: Map[String, List[(String, (String, Double))]] = addressToDateAndAvg.groupBy(_._1)
    result.foreach( println)
  }

}
