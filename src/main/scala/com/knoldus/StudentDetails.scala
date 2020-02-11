package com.knoldus

case class Student(studentId: Long, name: String)

case class Marks(subjectId: Int, studentId: Int, marksObtained: Float)

class StudentDetails {


  def studentRecord(list: List[Int], marksList: List[Marks], subjectIdInput: Int, percentage: Float, result: String): List[Int] = {
    result match {
      case "pass" => for (tempMarksList <- marksList if (tempMarksList.subjectId == subjectIdInput && tempMarksList.marksObtained >= percentage)) yield {
        tempMarksList.studentId
      }
      case "fail" => for (tempMarksList <- marksList if (tempMarksList.subjectId == subjectIdInput && tempMarksList.marksObtained < percentage)) yield {
        tempMarksList.studentId


      }


    }

  }

  def maxMinScorer(m: List[(Float, String)], studentlist: List[Student], markslist: List[Marks], subjectIdInput: Int, count: Int, topBottom: String): List[(Float, String)] = {
    topBottom match {
      case "top" => val maxScorer = for {index <- markslist.sortBy(_.marksObtained).reverse
                                         j <- studentlist
                                         if (index.subjectId == subjectIdInput && index.studentId == j.studentId)
                                         m = (index.marksObtained, j.name)

                                         } yield m
        maxScorer.take(count)
      case "top" => val minScorer = for {index <- markslist.sortBy(_.marksObtained)
                                         j <- studentlist
                                         if (index.subjectId == subjectIdInput && index.studentId == j.studentId)
                                         m = (index.marksObtained, j.name)

                                         } yield m
        minScorer.take(count)


    }
  }
}

/*def scored(percentage:Int,markslist:List[Marks],studentlist:List[Student]): Unit ={
  for{index<-markslist
    j<-studentlist



  }
}




}

def topAndBottonScorer(list: List[Float],markslist:List[Marks],studentList:List[Student],topOrBottom:String): Float={
 topOrBottom match {
   case "top" => for (i <- studentList
     for (j <- markslist
          if (i.studentId == j.studentId)) yield j.marksObtained

 )
 }









  }



}


}



*/


object StudentDetails {
  def main(args: Array[String]): Unit = {
    val a = new StudentDetails
    val studentList = List(Student(1, "Abhinav"), Student(2, "Akash"), Student(3, "Amit"), Student(4, "Anuj"), Student(5, "Akansha"), Student(6, "Arush"), Student(7, "krish"), Student(8, "Adil"), Student(9, "rishab"), Student(10, "riya"))
    val markslist1 = List(Marks(1, 1, 60), Marks(1, 2, 90), Marks(1, 3, 20), Marks(1, 4, 60), Marks(1, 5, 40), Marks(1, 6, 20), Marks(1, 7, 30), Marks(1, 8, 80), Marks(1, 9, 20), Marks(1, 10, 50), Marks(2, 1, 40), Marks(2, 2, 90), Marks(2, 3, 50), Marks(2, 4, 60), Marks(2, 5, 80), Marks(2, 6, 20), Marks(2, 7, 60), Marks(2, 8, 80), Marks(2, 9, 20), Marks(2, 10, 7)
      , Marks(3, 1, 60), Marks(3, 2, 80), Marks(3, 3, 20), Marks(3, 4, 60), Marks(3, 5, 80), Marks(3, 6, 20), Marks(3, 7, 60), Marks(3, 8, 80), Marks(3, 9, 20), Marks(3, 10, 50), Marks(4, 1, 60), Marks(4, 2, 80), Marks(4, 3, 20), Marks(4, 4, 60), Marks(4, 5, 80), Marks(4, 6, 20), Marks(4, 7, 60), Marks(4, 8, 80), Marks(4, 9, 20), Marks(4, 10, 50))


    val studentDetailsObj = a.studentRecord(List[Int](), markslist1, 1, 38, "pass")
    val listlength = studentDetailsObj.length
    println(s"pass $listlength")
    println(a.maxMinScorer(List[(Float, String)](), studentList, markslist1, 1, 5, "top"))

  }
}
