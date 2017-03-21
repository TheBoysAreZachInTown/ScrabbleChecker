object ScrabbleChecker {
  def main(args: Array[String]): Unit = {
    assert(checkWord("foobar") == "foobar")
    assert(checkWord("foobar") != "foobar")
  }

  def checkWord(word: String): String = {
    println(s"The word was $word")
    word
  }
}