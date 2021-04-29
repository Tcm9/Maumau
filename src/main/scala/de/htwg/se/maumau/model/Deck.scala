package de.htwg.se.maumau.model
import scala._
import scala.collection.mutable.ListBuffer
import scala.util.Random
import de.htwg.se.maumau.model.{Card, Color, Deck, Symbol}


case class Deck(cards: ListBuffer[Card] = ListBuffer[Card]()){
    val fullDeck =  ListBuffer[Card](
        Card(Color.Clubs, Symbol.ASS),
        Card(Color.Clubs, Symbol.Two),
        Card(Color.Clubs, Symbol.Three),
        Card(Color.Clubs, Symbol.Four),
        Card(Color.Clubs, Symbol.Five),
        Card(Color.Clubs, Symbol.Six),
        Card(Color.Clubs, Symbol.Seven),
        Card(Color.Clubs, Symbol.Eight),
        Card(Color.Clubs, Symbol.Nine),
        Card(Color.Clubs, Symbol.Ten),
        Card(Color.Clubs, Symbol.Jack),
        Card(Color.Clubs, Symbol.Lady),
        Card(Color.Clubs, Symbol.King),
        Card(Color.Spades, Symbol.ASS),
        Card(Color.Spades, Symbol.Two),
        Card(Color.Spades, Symbol.Three),
        Card(Color.Spades, Symbol.Four),
        Card(Color.Spades, Symbol.Five),
        Card(Color.Spades, Symbol.Six),
        Card(Color.Spades, Symbol.Seven),
        Card(Color.Spades, Symbol.Eight),
        Card(Color.Spades, Symbol.Nine),
        Card(Color.Spades, Symbol.Ten),
        Card(Color.Spades, Symbol.Jack),
        Card(Color.Spades, Symbol.Lady),
        Card(Color.Spades, Symbol.King),
        Card(Color.Diamonds, Symbol.ASS),
        Card(Color.Diamonds, Symbol.Two),
        Card(Color.Diamonds, Symbol.Three),
        Card(Color.Diamonds, Symbol.Four),
        Card(Color.Diamonds, Symbol.Five),
        Card(Color.Diamonds, Symbol.Six),
        Card(Color.Diamonds, Symbol.Seven),
        Card(Color.Diamonds, Symbol.Eight),
        Card(Color.Diamonds, Symbol.Nine),
        Card(Color.Diamonds, Symbol.Ten),
        Card(Color.Diamonds, Symbol.Jack),
        Card(Color.Diamonds, Symbol.Lady),
        Card(Color.Diamonds, Symbol.King),
        Card(Color.Hearts, Symbol.ASS),
        Card(Color.Hearts, Symbol.Two),
        Card(Color.Hearts, Symbol.Three),
        Card(Color.Hearts, Symbol.Four),
        Card(Color.Hearts, Symbol.Five),
        Card(Color.Hearts, Symbol.Six),
        Card(Color.Hearts, Symbol.Seven),
        Card(Color.Hearts, Symbol.Eight),
        Card(Color.Hearts, Symbol.Nine),
        Card(Color.Hearts, Symbol.Ten),
        Card(Color.Hearts, Symbol.Jack),
        Card(Color.Hearts, Symbol.Lady),
        Card(Color.Hearts, Symbol.King))
    val emptyDeck = ListBuffer[Card]()

    def throwDeck: Deck = copy(cards = cards.drop(cards.size))

    def fillDeck: Deck = copy(cards = cards.addAll(fullDeck))

    def shuffleDeck: Deck = copy(cards = Random.shuffle(cards))

    def throwCard(deck1: Deck): (Deck, Deck) = (copy(deck1.cards.addOne(cards.head)), copy(cards.drop(1)))

//  def throwCards(deck: ListBuffer[Card], deck2: ListBuffer[Card], number : Int) = {
//      for (i <- 1 to number if deck.size > 0) deck2. (getCard(deck)._2)
//     }
//
//    def getDeck(deck : ListBuffer[Card], card: Card): Deck = copy(deck.drop(deck.size)
}