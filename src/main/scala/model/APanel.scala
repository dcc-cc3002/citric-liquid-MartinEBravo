package cl.uchile.dcc.citric
package model

/** The `APanel` represents the abstract class of the future panels we are going to construct
 * We have many variables like the characters and the next panels, each one composed of
 * Arrays of multiples entities.
 *
 * The class can:
 *
 *  - add new characters
 *
 *  - delete existent characters (cheking if there are existing characters)
 *
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */
abstract class APanel extends Panel {
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
}
