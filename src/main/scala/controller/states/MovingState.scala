package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

/**
 * The state in which the player is moving through the board.
 *
 * @param controller
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 * */

class MovingState(
                   controller: GameController
                 ) extends GameState {

  /**
   * The player chooses a path to move.
   * We change the state to PlayerTurnState.
   *
   */
  override def choosePath(): Unit = {
    this.changeState(new MovingState(controller))
  }
}
