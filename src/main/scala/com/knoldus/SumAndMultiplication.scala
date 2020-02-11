package com.knoldus

class SumAndMultiplication {
  def multiplyElements(list: List[Int]): Int = {
    list.foldLeft(1) { (result, elements) => elements * result
    }

  }

  def addElements(list: List[Int]): Int = {
    list.foldLeft(0) { (result, elements) => elements + result
    }
  }
}

object SumAndMultiplication {
  def main(args: Array[String]): Unit = {
    val sumAndMultiplicationobj = new SumAndMultiplication
    println(sumAndMultiplicationobj.multiplyElements(List(1, 2, 3, 4)))
    println(sumAndMultiplicationobj.addElements(List(1, 2, 3, 4)))
  }
}
