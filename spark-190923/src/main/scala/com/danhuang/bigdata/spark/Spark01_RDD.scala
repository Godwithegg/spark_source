package com.danhuang.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Spark01_RDD {

  def main(args: Array[String]): Unit = {

    val config: SparkConf = new SparkConf().setMaster("local[*]").setAppName("WordCount")

    //创建Spark上下文对象
    val sc = new SparkContext(config)

    //创建RDD
    //1）从内存中创建 makeRDD
//    val listRDD: RDD[Int] = sc.makeRDD(List(1,2,3,4))
    //使用自定义的分区
//    val listRDD: RDD[Int] = sc.makeRDD(List(1,2,3,4),2)
    //val value: RDD[String] = sc.makeRDD(List("1","2","3","4"))
    //2）从内存中创建parallelize
    //val arrayRDD: RDD[Int] = sc.parallelize(Array(1,2,3,4))

    //3）从外部存储中创建
    //默认情况下，我们可以读取项目路径，也可以读取其他路径：HDFS
    //默认从文件中读取的数据都是字符串类型
//    val fileRDD: RDD[String] = sc.textFile("in")
    val fileRDD: RDD[String] = sc.textFile("in",3)


//    listRDD.collect().foreach(println)

    //将RDD的数据保存到文件中
//    listRDD.saveAsTextFile("output")
    fileRDD.saveAsTextFile("output")
  }


}
