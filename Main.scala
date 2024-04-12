
import players.players
import Cards.Cards
import  playground.playground


object Main extends App {
  println("Player: Please enter the number of players")

  val waiting = scala.io.StdIn.readLine()

  val input = try {
    scala.io.StdIn.readInt()
  } catch {
    case _: NumberFormatException =>
      println("Invalid input. Please enter a valid integer.")
      0
  }

  val (playerHands, updatedSuit) = Cards.dealCardsToPlayers(Cards.Suit, input)

  /*playerHands.foreach { case (player, cards) =>
    println(s"$player cards: $cards")
  }*/

  println("Welcome Players to the Playground...")
  println("Please positioning your cards")
  println("The Number from 1 to 3 is your Defenders, and the Number 4 is your goalkeeper. " +
    "The goalkeeper should be the most valuable card.")

}