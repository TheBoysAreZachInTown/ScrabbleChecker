object ScrabbleChecker {
  def main(args: Array[String]): Unit = {
    assert(checkWord("foobar") == ???)
    assert(checkWord("foobar") != ???)
  }

  def checkWord(word: String): Int = {
    val dictionary: List[String] = scala.io.Source.fromFile("/usr/share/dict/words").getLines.toList
    val tileList: List[Tile] = List(
      Tile('a', 1),
      Tile('b', 3),
      Tile('c', 3),
      Tile('d', 2),
      Tile('e', 1),
      Tile('f', 4),
      Tile('g', 2),
      Tile('h', 4),
      Tile('i', 1),
      Tile('j', 8),
      Tile('k', 5),
      Tile('l', 1),
      Tile('m', 3),
      Tile('n', 1),
      Tile('o', 1),
      Tile('p', 3),
      Tile('q', 10),
      Tile('r', 1),
      Tile('s', 1),
      Tile('t', 1),
      Tile('u', 1),
      Tile('v', 4),
      Tile('w', 4),
      Tile('x', 8),
      Tile('y', 4),
      Tile('z', 10)
    )

    if(dictionary.contains(word)) {
      ???
    } else {
      println(s"$word not in the dictionary.")
      -1
    }
  }

  case class Tile(letter: Char, value: Int)
}