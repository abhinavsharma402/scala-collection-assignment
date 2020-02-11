package com.knoldus

class Stack {
  def push(list: List[Int], input: Int): List[Int] = {

    if (list.isEmpty)
      input :: list
    else {
      input :: list
    }
  }

  def pop(list: List[Int]): Int = {
    list.head
  }
}

object Stack {
  def main(args: Array[String]): Unit = {


    val stackObj = new Stack
    println(stackObj.push(List(1, 2), 8))

    println(stackObj.pop(List(1, 3, 5, 9)))
  }
}