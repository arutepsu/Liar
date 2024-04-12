package players

object players extends App {
  
  //function to show player's next card, trigger keyword : show next
  def showNextCard(cardList: List[String]): String = {
    cardList.head
  }

  //function so that player can name themself
  def myNameIs(): Unit = {
    val inputName = scala.io.StdIn.readLine()
  }
  
}
