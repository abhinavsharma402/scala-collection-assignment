package com.knoldus

class TableOfListElements {
  def tableOfElements(list: List[Int], k: Int, index: Int, tempList: List[Int]): List[Int] = {
    if (index < list.length) {
      if (k == 11) {

        tableOfElements(list, 1, index + 1, tempList)
      }
      else {

        tableOfElements(list, k + 1, index, tempList :+ list(index) * k)
      }
    }
    else {
      tempList
    }
  }
}

object TableOfListElements {
  def main(args: Array[String]): Unit = {
    val tableOfListElementsobj = new TableOfListElements
    print(tableOfListElementsobj.tableOfElements(List(1, 2), 1, 0, List()))
  }
}
