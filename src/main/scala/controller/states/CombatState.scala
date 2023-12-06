package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

/**
 * CombatState is a GameState where the player is in combat.
 *
 * @param controller
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 * */

class CombatState(
                 controller: GameController
                 ) extends GameState{
  /**
   * attack is a method that changes the state of the game to WaitState.
   */
  override def attack: Unit = {
    this.changeState(new WaitState(controller))
  }

  /**
   * endCombat is a method that changes the state of the game to LandingPanelState.
   */
  override def endCombat: Unit = {
    this.changeState(new LandingPanelState(controller))
  }
}
