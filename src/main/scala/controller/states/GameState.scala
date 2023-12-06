package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

/**
 * GameState is a class that represents the state of the game.
 * It is used to change the state of the game.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */

class GameState {
  var controller: Option[GameController] = None
  def setController(controller: GameController): Unit = {
    this.controller = Some(controller)
  }
  def changeState(state: GameState): Unit = {
    controller.get.changeState(state)
  }
  def error = throw new Exception("Error: this method should not be called")

  def startGame(): Unit = error
  def newChapter(): Unit = error
  def normaSixReached(): Unit = error
  def isKO(): Unit = error
  def insuficientRoll(): Unit = error
  def suficientRoll(): Unit = error
  def doEffect(): Unit = error
  def playTurn(): Unit = error
  def endCombat(): Unit = error
  def stopMovement(): Unit = error
  def outOfMovement(): Unit = error
  def rollDice(): Unit = error
  def choosePath(): Unit = error
  def attack(): Unit = error
  def evade(): Unit = error
  def defend(): Unit = error

}
