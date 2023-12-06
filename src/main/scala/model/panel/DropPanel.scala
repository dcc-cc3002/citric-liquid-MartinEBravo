package cl.uchile.dcc.citric
package model.panel

import cl.uchile.dcc.citric.model.unities.character.PlayerCharacter
import scala.collection.mutable.ArrayBuffer


/** The `DropPanel` represents the class of the drop panels,
 * We have many variables like the characters and the next panels, each one composed of
 * Arrays of multiples entities.
 *
 * The class can:
 *
 *  - add new characters
 *
 *  - delete existent characters (cheking if there are existing characters)
 *
 *  - take points from the characters
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */

class DropPanel extends AbstractPanel {
  /**
   * Takes stars from the player that lands on the panel.
   */
  def apply(player: PlayerCharacter): Unit = {
    val roll: Int = player.rollDice
    val Norma: Int = player.norma.normaNumber
    player.stars = player.stars - roll*Norma
  }
}
