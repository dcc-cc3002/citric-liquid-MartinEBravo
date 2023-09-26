package cl.uchile.dcc.citric
package model.Panel

import cl.uchile.dcc.citric.model.Unities.PlayerCharacter
import scala.collection.mutable.ArrayBuffer

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
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */
abstract class APanel extends Panel {
  val characters: ArrayBuffer[PlayerCharacter] = ArrayBuffer.empty
  var nextPanels: ArrayBuffer[Panel] = ArrayBuffer.empty

  /** Add a new character to the buffer */
  def addCharacter(player: PlayerCharacter): Boolean = {
    characters += player
    true
  }

  /** Delete a character from the buffer */
  def removeCharacter(player: PlayerCharacter): Boolean = {
    if (!characters.isEmpty) {
      characters -= player
    }
    true
  }
}
