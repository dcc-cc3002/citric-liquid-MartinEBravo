package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

/**
 * The StartState class represents the state of the game when it is in the start menu.
 *
 * @param controller is the controller of the game.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 * */

class StartState(
                  controller: GameController
                ) extends GameState {
  /**
   * startGame is a method that changes the state of the game to ChapterState.
   *
   * We add four characters to the game, and then we change the state to ChapterState.
   * */
  override def startGame(): Unit = {

    /** We simulate the input of the user */
    val playerInputs = List("Player1", "Player2", "Player3", "Player4")

    /** We add the characters to the game */
    playerInputs.foreach { name =>
      controller.addCharacter(name)
    }

    /**
     * We shuffle the players, so the order of the players is random.
     * */
    controller.shufflePlayers()

    /** We change the state to ChapterState */
    this.changeState(new ChapterState(controller))
  }
}