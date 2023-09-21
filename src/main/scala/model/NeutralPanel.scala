package cl.uchile.dcc.citric
package model
import scala.collection.mutable.ArrayBuffer

class NeutralPanel extends APanel{
  var characters: ArrayBuffer[PlayerCharacter] = ArrayBuffer.empty
  var nextPanels: ArrayBuffer[Panel] = ArrayBuffer.empty
  def addCharacter(player: PlayerCharacter): Unit = {
    characters += player
  }
  def removeCharacter(player: PlayerCharacter): Unit = {
    if (characters.isEmpty) {
      println("There are no characters to remove")
    } else {
      characters -= player
    }
  }
}
