package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController
import cl.uchile.dcc.citric.model.unities.character.PlayerCharacter

/**
 * This class represents the state of the game when the player is beggining
 * his turn.
 *
 * @param controller
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */

class PlayerTurnState(
                       controller: GameController
                      ) extends GameState {

  /**
   * A player should check if he is KO.
   */
  override def isKO(): Unit = {
    this.changeState(new RecoveryState(controller))
  }

  /**
   * A player should stop movement
   */
  override def stopMovement(): Unit = {
    this.changeState(new CombatState(controller))
  }

  /**
   * A player should check if he is out of movement.
   */
  override def outOfMovement(): Unit = {
    this.changeState(new CombatState(controller))
  }
}
