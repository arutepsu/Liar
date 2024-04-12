package playground

object playground {

  println("Welcome Players to the Playground...")
  println("I will be your assistant in this game, please tell me your name...")
  println("The Number from 1 to 3 is your Defenders, and the Number 4 is your goalkeeper. " +
            "The goalkeeper should be the most valuable card.")

  private val Player_position = collection.mutable.Map[Int, String]()
  private val Computer_position = collection.mutable.Map[Int, String]()
  
  //function to add the card to the position.
  private def add(number: Int, card : String, position: collection.mutable.Map[Int, String] ) : collection.mutable.Map [Int, String] = {
    position +=(number -> card)
  }
  private def showPosition(position: collection.mutable.Map[Int, String]): Unit = {
    println(position)
  }
  add(1,"7 of Hearts",Player_position)
  showPosition(Player_position)
}
