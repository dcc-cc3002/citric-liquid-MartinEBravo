package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController
import cl.uchile.dcc.citric.model.unities.character.PlayerCharacter

/**
 *
 * RecoveryState is a GameState where the player can roll the dice to recover
 *
 * @param controller
 */

class RecoveryState(
                    controller: GameController
                   ) extends GameState {

  /**
   * Returning to the chapter state
   */
  override def insuficientRoll(): Unit = {
    this.changeState(new ChapterState(controller))
  }
  /**
   * Returning to the player turn state
   */
  override def suficientRoll(): Unit = {
    this.changeState(new PlayerTurnState(controller))
  }

}
