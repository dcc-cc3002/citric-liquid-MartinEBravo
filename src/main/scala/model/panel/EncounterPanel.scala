package cl.uchile.dcc.citric
package model.panel
import model.unities.{PlayerCharacter, WildUnit}

import scala.annotation.unused


/** The `EncounterPanel` represents the class of the encounter panels,
 * We have many variables like the characters and the next panels, each one composed of
 * Arrays of multiples entities.
 *
 * The class can:
 *
 *  - add new characters
 *
 *  - delete existent characters (cheking if there are existing characters)
 *
 *  - start a battle
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *  */
class EncounterPanel(@unused wildUnit: WildUnit) extends AbstractPanel{

  /**
   * Starts a battle with the player that lands on the panel.
   */
  def apply(@unused player: PlayerCharacter): Unit = {
  }
}
