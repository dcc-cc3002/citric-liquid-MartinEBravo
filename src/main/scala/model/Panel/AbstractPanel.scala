package cl.uchile.dcc.citric
package model.panel

import cl.uchile.dcc.citric.model.unities.character.PlayerCharacter
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

  /**
   * Attributes
   */
  private var _characters: ArrayBuffer[PlayerCharacter] = ArrayBuffer.empty
  private var _nextPanels: ArrayBuffer[Panel] = ArrayBuffer.empty

  /**
   * Getters and Setters
   */
  def characters: ArrayBuffer[PlayerCharacter] = _characters
  def nextPanels: ArrayBuffer[Panel] = _nextPanels

  /** Add a new character to the buffer */
  def addCharacter(player: PlayerCharacter): Unit = {
    _characters += player
  }

  /** Delete a character from the buffer */
  def removeCharacter(player: PlayerCharacter): Unit = {
    _characters -= player
  }

  /**
   * Add a new panel to the buffers
   * */
  def addPanels(panels: Panel): Unit = {
    _nextPanels += panels
  }

  /**
   * Delete a panel from the buffer
   * */
  def removePanels(panels: Panel): Unit = {
    _nextPanels -= panels
  }



}
