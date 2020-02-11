package com.knoldus

class LastElement {
  def lastElement(list: List[Int], index: Int): (Int, Int) = {
    if (index != list.length - 1) {
      lastElement(list, index + 1)
    }
    else {
      (list(index), index)
    }
  }

}

object LastElement {
  def main(args: Array[String]): Unit = {
    val lastElementobj = new LastElement
    print(lastElementobj.lastElement(List(1, 2, 3), 0))
  }
}
