package cl.uchile.dcc.citric
package model.panel

import cl.uchile.dcc.citric.model.unities.PlayerCharacter
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
abstract class AbstractPanel extends Panel {

  private var _characters: ArrayBuffer[PlayerCharacter] = ArrayBuffer.empty
  private var _nextPanels: ArrayBuffer[Panel] = ArrayBuffer.empty

  /** Return the characters in the buffer */
  def characters: Seq[PlayerCharacter] = _characters

  /** Set the characters in the buffer */
  def characters_=(newCharacters: Seq[PlayerCharacter]): Unit = {
    _characters = ArrayBuffer.from(newCharacters)
  }

  /** Add a new character to the buffer */
  def addCharacter(player: PlayerCharacter): Unit = {
    _characters += player
  }

  /** Delete a character from the buffer */
  def removeCharacter(player: PlayerCharacter): Unit = {
    _characters -= player
  }

  /** Return the next panels */
  def nextPanels: Seq[Panel] = _nextPanels

  /** Set the next panels */
  def nextPanels_=(newNextPanels: Seq[Panel]): Unit = {
    _nextPanels = ArrayBuffer.from(newNextPanels)
  }
}
