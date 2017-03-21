object TestCaseFinder {
  def main(args: Array[String]): Unit = {
    val tileList: List[Tile] = List(
      Tile('a', 9, 1),
      Tile('b', 2, 3),
      Tile('c', 2, 3),
      Tile('d', 4, 2),
      Tile('e', 12, 1),
      Tile('f', 2, 4),
      Tile('g', 3, 2),
      Tile('h', 2, 4),
      Tile('i', 9, 1),
      Tile('j', 1, 8),
      Tile('k', 1, 5),
      Tile('l', 4, 1),
      Tile('m', 2, 3),
      Tile('n', 6, 1),
      Tile('o', 8, 1),
      Tile('p', 2, 3),
      Tile('q', 1, 10),
      Tile('r', 6, 1),
      Tile('s', 4, 1),
      Tile('t', 6, 1),
      Tile('u', 4, 1),
      Tile('v', 2, 4),
      Tile('w', 2, 4),
      Tile('x', 1, 8),
      Tile('y', 2, 4),
      Tile('z', 1, 10)
    )

    val dictionary: List[String] = scala.io.Source.fromFile("/usr/share/dict/words").getLines.toList

    val testCases: List[String] = dictionary filter { word: String =>

      val wordTiles: List[Tile] = word.toList.flatMap { letter: Char =>
        tileList.filter(_.letter == letter)
      }

      val badTiles: Set[(Tile, Int)] = wordTiles.filter { tileToCheck: Tile =>
        wordTiles.count(_ == tileToCheck) > tileToCheck.totalAmount
      }.map(tile => (tile, wordTiles.count(_ == tile))).toSet

      //badTiles.map(_._2).sum - badTiles.map(_._1.totalAmount).sum > 2
      badTiles.map(_._2).sum - badTiles.map(_._1.totalAmount).sum == 2 && badTiles.size == 1

    }

    println(testCases)
  }

  case class Tile(letter: Char, totalAmount: Int, value: Int)
}