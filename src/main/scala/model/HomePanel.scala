package cl.uchile.dcc.citric
package model

class HomePanel extends APanel {
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
  var owner: playerCharacter

  def activate(player: playerCharacter): Unit = {
    if (player == owner) {
      player.stop()
      player.maxHP += 1
      // norma.Check()
    } else {
      println("You are not owner of this panel")
    }
  }
}

