package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

/**
 * WaitState is a GameState where the player can choose to evade or defend
 *
 * @param controller
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 */
class WaitState(controller: GameController
               ) extends GameState {
  override def evade(): Unit = {
    this.changeState(new CombatState(controller))
  }
  override def defend(): Unit = {
    this.changeState(new CombatState(controller))
  }

}
