package cl.uchile.dcc.citric
package model.panel

import cl.uchile.dcc.citric.model.unities.character.PlayerCharacter
import scala.collection.mutable.ArrayBuffer


/** The `HomePanel` represents the class of the home panels,
 * We have many variables like the characters and the next panels, each one composed of
 * Arrays of multiples entities.
 *
 * The class can:
 *
 *  - add new characters
 *
 *  - delete existent characters (cheking if there are existing characters)
 *
 *  - save the owner(s) of the panel
 *
 *  - activate depending of the player
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */
class HomePanel(private val _owner: PlayerCharacter) extends AbstractPanel {

  /**
   * Get the owner of the panel
   */
  def owner: PlayerCharacter = _owner

  /**
   * Make the NormaCheck effect to the owner
   */
  def apply(): Unit = {
    _owner.normaCheck()
  }
}

