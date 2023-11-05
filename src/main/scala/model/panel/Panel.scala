package cl.uchile.dcc.citric
package model.panel
import model.unities.PlayerCharacter

import scala.collection.mutable.ArrayBuffer

/** Represents a single cell on a board, known as a Panel.
  *
  * Each panel has its own effect, which can be applied to a character.
  * In the context of the board game, a panel represents a tile or space that a character lands on
  * and experiences an effect (e.g., losing stars, fighting an enemy, etc.).
  * Panels can also be connected to other panels, allowing for the formation of complex board
  * structures.
  *
  * @author [[https://github.com/r8vnhill Ignacio Slater M.]]
  * @author [[https://github.com/MartinEBravo]]
  */
trait Panel {

  /** Getters and Setters */
  def characters: ArrayBuffer[PlayerCharacter]
  def nextPanels: ArrayBuffer[Panel]

  /** Adds a new character to the panel. */
  def addCharacter(player: PlayerCharacter): Unit

  /** Removes a character from the panel. */
  def removeCharacter(player: PlayerCharacter): Unit

  /** Adds a new panel to the panel. */
  def addPanels(panels: Panel): Unit

  /** Removes a panel from the panel. */
  def removePanels(panels: Panel): Unit

}
