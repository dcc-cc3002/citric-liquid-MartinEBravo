package cl.uchile.dcc.citric
package model.Panel

import cl.uchile.dcc.citric.model.Unities.PlayerCharacter
import scala.collection.mutable.ArrayBuffer
import scala.util.Random


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
class EncounterPanel extends APanel{

  /** Start a battle with a random Wild Unit */
  def battle(player: PlayerCharacter): Unit = {
    /** Here the battle will be implemented in the following versions */
    /** for now just downgrade the HP simulating a fight*/
    player.HP = player.HP - 1
  }
}
