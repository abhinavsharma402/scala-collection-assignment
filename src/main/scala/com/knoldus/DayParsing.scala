package com.knoldus

class DayParsing {


  def apply(dd: Int, mm: Int, yy: Int, HH: Int, MM: Int, SS: Int) = dd + "-" + mm + "-" + yy + ":" + HH + ":" + MM + ":" + SS

  def unapply(str: String): Option[String] = {
    val partitonStr = str split "-"
    if (partitonStr.length == 3) Some(partitonStr(0)) else None
  }
}

object DayParsing {
  def main(args: Array[String]): Unit = {

    val dayParsingobj = new DayParsing
    dayParsingobj.apply(29, 1, 2020, 16, 12, 19)


    print(dayParsingobj.unapply("29-1-2020:16:12:19"))
  }
}