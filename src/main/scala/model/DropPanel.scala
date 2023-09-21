package cl.uchile.dcc.citric
package model

class DropPanel extends APanel {
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
  def bonus(player: PlayerCharacter): Unit = {
    roll = player.rollDice()
    // player.stars -= roll*Norma
  }
}
