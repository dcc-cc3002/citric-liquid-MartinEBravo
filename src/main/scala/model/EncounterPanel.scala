package cl.uchile.dcc.citric
package model
/** The `EncounterPanel` represents the class of the encounter panels,
 * We have many variables like the characters and the next panels, each one composed of
 * Arrays of multiples entities.
 *
 * The class can:
 *
 *  - add new characters
 *
 *  - delete existent characters (cheking if there are existing characters)
 *
 *  - start a battle
 *
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */
class EncounterPanel extends APanel{
  var characters: ArrayBuffer[PlayerCharacter] = ArrayBuffer.empty
  var nextPanels: ArrayBuffer[Panel] = ArrayBuffer.empty
  /** Add a new character to the buffer */
  def addCharacter(player: PlayerCharacter): Unit = {
    characters += player
  }
  /** Delete a character from the buffer */
  def removeCharacter(player: PlayerCharacter): Unit = {
    if (characters.isEmpty) {
      println("There are no characters to remove")
    } else {
      characters -= player
    }
  }
  /** Start a battle with a random Wild Unit */
  def battle(player: PlayerCharacter): Unit = {
    // player.battle(Random(ArrayBuffer[WildUnit]))
  }
}
