//6. Write an enumeration describing the four playing card suits so that the toString method returns ♣,
//♦, ♥, or ♠.

object CardSuits extends Enumeration {

  val Hearts = Value("\u2665")
  val Diamonds = Value("\u2666")
  val Clubs = Value("\u2663")
  val Spades = Value("\u2660")

}

CardSuits.values.toString()
CardSuits.Clubs