package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController


/**
 * A state where the player is in the landing panel.
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

class LandingPanelState(
                        controller: GameController
                       ) extends GameState {

  /**
   * The player do the effect of the landing panel.
   *
   * We change the state to ChapterState.
   *
   *
   */
  override def doEffect(): Unit = {
    this.changeState(new ChapterState(controller))
  }
}
