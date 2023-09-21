package cl.uchile.dcc.citric
package model

class EncounterPanel extends APanel{
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
  def battle(player: PlayerCharacter): Unit = {
    player.battle(Random(ArrayBuffer[WildUnit]))
  }
}
