package com.danhuang.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark09_Oper8 {
  def main(args: Array[String]): Unit = {

    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")

    //创建Spark上下文对象
    val sc = new SparkContext(config)

    //生成数据，按照指定规则进行分组
    //分组后的数据，形成了对偶元组(k_v)，k表示分组的key，v表示分组的数据集合
    val listRDD: RDD[Int] = sc.makeRDD(1 to 10)

    //从指定的数据集合中进行抽样处理，根据不同的算法进行抽样
    val sampleRDD: RDD[Int] = listRDD.sample(true,4,1)
    sampleRDD.collect().foreach(println)

  }

}
