//7. Implement a function that checks whether a card suit value from the preceding exercise is red.

object CardSuits extends Enumeration {

  type CardSuits = Value             // This row is important !
  val Hearts = Value("\u2665")
  val Diamonds = Value("\u2666")
  val Clubs = Value("\u2663")
  val Spades = Value("\u2660")

  def checkIfRed(card: CardSuits)= {
    card == Hearts || card == Diamonds
  }

}

CardSuits.checkIfRed(CardSuits.Hearts)
CardSuits.checkIfRed(CardSuits.Clubs)
CardSuits.checkIfRed(CardSuits.Diamonds)
CardSuits.checkIfRed(CardSuits.Spades)