package com.knoldus

class AggregateLists {
  def aggregateListelements(list1: List[Int], list2: List[String]): List[List[(Int, String)]] = {
    List(list1 zip (list2))

  }
}

object Aggregate {
  def main(args: Array[String]): Unit = {
    val aggregateObject = new AggregateLists
    print(aggregateObject.aggregateListelements(List(1, 2), List("a", "b")))
  }
}


