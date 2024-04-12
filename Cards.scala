package Cards

object Cards {
  /*
  Creating a Suit using flatmap
  Flat map will rather create another List.
  The data structure of the Suit will be treated
  as a List for the simplicity
   */
  import scala.util.Random

  val Suit: List[String] = List("Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "King", "Queen", "Jack").flatMap(number => List("Hearts",
    "Diamond", "Spades", "Clubs").map(suit => s"|$number of $suit|"))
  //count variable to determine the number of cards in the desk.
  //val count = Suit.length
  //println(Suit)
  //println(count)
  //Since List anthe "alike" collection is immutable, so you need to assign the shuffle to a new variable.
  //val ShuffleDesk = Random.shuffle(Suit)
  //println(ShuffleDesk)

  //val randomCard = ShuffleDesk(Random.nextInt(ShuffleDesk.length))
  /*
    PLayerCard will be created by taking respectively a pack of cards, depending on the number of players.
   */

  //This function deal cards with player, then drop it and update the new deck
  def PlayerCardsGenerator(deck: List[String], numCards: Int): (List[String], List[String]) = {
    val playerCards = deck.take(numCards)
    val remainingDeck = deck.drop(numCards)
    (playerCards, remainingDeck)
  }
  //This function deal cards base on the number of player with a fixed number,(in this game there will be only 2 players)
  def dealCardsToPlayers(deck: List[String], numPlayers: Int): (Map[String, List[String]], List[String]) = {
    var currentDeck = Random.shuffle(deck)
    val playerHands = (1 to numPlayers).map { player =>
      val (cards, remainingDeck) = PlayerCardsGenerator(currentDeck, 26)
      currentDeck = remainingDeck // Update the current deck
      s"Player $player" -> cards
    }.toMap
    (playerHands, currentDeck)
  }

  /*val (playerHands, updatedSuit) = dealCardsToPlayers(Suit, 2)

  playerHands.foreach { case (player, cards) =>
    println(s"$player cards: $cards")
  }
  println("Updated Suit after dealing cards: " + updatedSuit)*/

}
