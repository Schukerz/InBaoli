package com.atguigu.bigdata.scala.sz.chapter06

object Scala23_Trait6 {
  def main(args: Array[String]): Unit = {
    val sql = new MySQL
    sql.operateDate
  }
}
trait Operate{
  def operateDate={
    println("操作数据")

  }

}
trait Memory extends Operate{
  override def operateDate: Unit = {
    println("向内存中")
    super.operateDate
  }
}
trait File extends Operate{
  override def operateDate: Unit = {
    println("向文件中")
    super[Operate].operateDate
  }
}
class MySQL extends Memory with File{
}
