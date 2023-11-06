package cl.uchile.dcc.citric
package model.Panel

import scala.math._
import cl.uchile.dcc.citric.model.Unities.PlayerCharacter
import model.Norm.NormX

import scala.collection.mutable.ArrayBuffer


/** The `BonusPanel` represents the class of the bonus panels,
 * We have many variables like the characters and the next panels, each one composed of
 * Arrays of multiples entities.
 *
 * The class can:
 *
 *  - add new characters
 *
 *  - delete existent characters (cheking if there are existing characters)
 *
 *  - give bonus to the characters
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */

class BonusPanel extends APanel {

  /** Add bonus to the character */
  def apply(player: PlayerCharacter): Unit = {
    var roll: Int = player.rollDice()
    var norm: Int = player.Norma.name
    player.stars = player.stars + min(roll*norm, roll*3)
  }
}
