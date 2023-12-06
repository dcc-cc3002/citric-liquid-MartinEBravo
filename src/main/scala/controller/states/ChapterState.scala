package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

/**
 * The ChapterState is the state where the game is in the
 * beginning of a chapter.
 *
 *
 * @param controller
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 * */

class ChapterState (
                   controller: GameController
                   ) extends GameState {

  controller.chapter = controller.chapter + 1

  /**
   * We add one more chapter and shuffle the players.
   */
  override def playTurn(): Unit = {
    this.changeState(new PlayerTurnState(controller))
  }

  /**
   * The character is KO, so we change the state to RecoveryState.
   */
  override def isKO(): Unit = {
    this.changeState(new RecoveryState(controller))
  }

  /**
   * The character has reached norma 6, so the game is over.
   */
  override def normaSixReached(): Unit = {
    this.changeState(new EndState(controller))
  }

}
