package cl.uchile.dcc.citric
package model.panel

import cl.uchile.dcc.citric.model.unities.character.PlayerCharacter
import scala.annotation.unused

/** The `NeutralPanel` represents the class of the neutral panels,
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
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */
class NeutralPanel extends AbstractPanel {

  /**
   * apply the effect of the panel to the player
   */
  def apply(@unused player: PlayerCharacter): Unit = {
  }

}
