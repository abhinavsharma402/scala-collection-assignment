package com.knoldus

class Url {
  def apply(protocol: String, domain: String, path: String, params: Map[String, String]): String = {
    s"$protocol://$domain$path?" + params.map { case (key, value) => s"$key=$value" }.mkString("&")
  }

  def unapply(url: String): Option[(String, String, String, Map[String, String])] = {
    val protocol = url split "://"
    val domain = protocol(1) split "/"
    val partition = url split "[?]"
    val path = partition(0) split ".com"
    val params = url split "[=&?]"
    Some(protocol(0), domain(0), path(1), Map(params(1) -> params(2), params(3) -> params(4), params(5) -> params(6)))
  }
}

object Url {
  def main(args: Array[String]): Unit = {


    val urlObject = new Url
    urlObject.apply("https", "aws.amazon.com", "/console/home", Map("state" -> "hash", "isauthcode" -> "true", "code" -> "112"))
    print(urlObject.unapply("https://aws.amazon.com/console/home?state=hash&isauthcode=true&code=112"))
  }
}
