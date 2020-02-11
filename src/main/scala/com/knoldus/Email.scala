package com.knoldus

class Email {
  def email(mail: String): String = {
    val EMAIL = """(^[A-Za-z0-9][A-Za-z0-9\.]*)@((?:[A-Za-z0-9]+\.)+[A-Za-z]{2,63}$)""".r
    mail match {
      case EMAIL(user, domain) =>
        s"user :: $user, domain :: $domain"

      case _ => "invalid input"

    }

  }

}

object Email {
  def main(args: Array[String]): Unit = {
    val emailObj = new Email
    print(emailObj.email("knol@knoldus.com"))
  }
}
