package com.danhuang.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark07_Oper6 {
  def main(args: Array[String]): Unit = {

    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")

    //创建Spark上下文对象
    val sc = new SparkContext(config)

    //生成数据，按照指定规则进行分组
    //分组后的数据，形成了对偶元组(k_v)，k表示分组的key，v表示分组的数据集合
    val listRDD: RDD[Int] = sc.makeRDD(List(1,2,3,4))

    val groupByRDD: RDD[(Int, Iterable[Int])] = listRDD.groupBy(i=>i%2)

    groupByRDD.collect().foreach(println)

  }

}
