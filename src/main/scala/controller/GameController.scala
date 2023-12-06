package cl.uchile.dcc.citric
package controller

import model.unities.character.PlayerCharacter
import cl.uchile.dcc.citric.controller.states.{GameState, StartState}

import scala.collection.mutable.ArrayBuffer

/**
 * GameController is the class that controls the game
 *
 * @param state: GameState
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */

class GameController {
  // Estado actual del juego
  var state: GameState = new StartState(this)

  /**
   * Observer
   */
   def update(player: PlayerCharacter): Boolean = {
     println(s"Player ${player.name} has reached Norma ${player.norma}")
     true
   }

  /**
   * Change the state of the game
   * */
  def changeState(newState: GameState): Unit = {
    state = newState
    state.setController(this)
  }

  /**
   * Players
   */
   private var _playersArray: ArrayBuffer[PlayerCharacter] = ArrayBuffer.empty[PlayerCharacter]

  /**
   * Number of the Chapter
   */
  private var _chapter: Int = 0

  /**
   * Getters & Setters
   */
    def playersArray: ArrayBuffer[PlayerCharacter] = _playersArray
  def chapter: Int = _chapter
  def chapter_=(value: Int): Unit = Math.max(value, 0)

  /**
   * Shuffle the players
   */
  def shufflePlayers(): Unit = {
    _playersArray = scala.util.Random.shuffle(_playersArray)
  }

  /**
   * Add Characters to the game
   *
   * @param character: PlayerCharacter
   */
    def addCharacter(name: String): Unit = {
      /** Random number between 1 to 5 */
      val randomNum = scala.util.Random.nextInt(5) + 1
      val character = new PlayerCharacter(name, randomNum, randomNum, randomNum, randomNum)
      _playersArray += character
    }

  /**
   * Methods that change the state of the game
   */

  def startGame(): Unit = state.startGame()
  def newChapter(): Unit = state.newChapter()
  def normaSixReached(): Unit = state.normaSixReached()
  def isKO(): Unit = state.isKO()
  def insuficientRoll(): Unit = state.insuficientRoll()
  def suficientRoll(): Unit = state.suficientRoll()
  def doEffect(): Unit = state.doEffect()
  def playTurn(): Unit = state.playTurn()
  def endCombat(): Unit = state.endCombat()
  def stopMovement(): Unit = state.stopMovement()
  def outOfMovement(): Unit = state.outOfMovement()
  def rollDice(): Unit = state.rollDice()
  def choosePath(): Unit = state.choosePath()
  def attack(): Unit = state.attack()
  def evade(): Unit = state.evade()
  def defend(): Unit = state.defend()

}
