package com.knoldus

class QueueImplementation{
  def enqueue(list: List[Int],input:Int):List[Int]={

  if(list.isEmpty)
  list:+input
    else{
    list:+input
  }
  }

  def dequeue(list:List[Int]):List[Int]=
  {
    list.tail
  }
}
object Queue {
  def main(args: Array[String]): Unit = {


    val queueObject = new QueueImplementation
    println(queueObject.enqueue(List(1,2), 8))

    println(queueObject.dequeue(List(1, 3, 5, 9)))
  }
}