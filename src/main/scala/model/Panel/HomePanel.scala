package cl.uchile.dcc.citric
package model.Panel

import cl.uchile.dcc.citric.model.Unities.PlayerCharacter
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
class HomePanel(val owner: PlayerCharacter) extends APanel {

  /** Activation of the panel depending on the player */
  def activate(player: PlayerCharacter): Boolean = {
    true
  }
}

