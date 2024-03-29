package cl.uchile.dcc.citric
package model.Unities

import scala.util.Random
import model.Norm.NormX


/** The `PlayerCharacter` class represents a character or avatar in the game, encapsulating
  * several attributes such as health points, attack strength, defense capability,
  * and evasion skills. Each player has a unique name, and throughout the game,
  * players can collect stars, roll dice, and progress in levels known as 'norma'.
  * This class not only maintains the state of a player but also provides methods
  * to modify and interact with these attributes.
  *
  * For instance, players can:
 *
  * - Increase or decrease their star count.
 *
  * - Roll a dice, a common action in many board games.
 *
  * - Advance their norma level.
  *
  * Furthermore, the `Player` class has a utility for generating random numbers,
  * which is primarily used for simulating dice rolls. By default, this utility is
  * an instance of the `Random` class but can be replaced if different random
  * generation behaviors are desired.
  *
  * @param name The name of the player. This is an identifier and should be unique.
  * @param maxHp The maximum health points a player can have. It represents the player's endurance.
  * @param attack The player's capability to deal damage to opponents.
  * @param defense The player's capability to resist or mitigate damage from opponents.
  * @param evasion The player's skill to completely avoid certain attacks.
  * @param randomNumberGenerator A utility to generate random numbers. Defaults to a new `Random`
  *                              instance.
  *
  * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
  * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
  * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
  * @author [[https://github.com/Seivier/ Vicente González B.]]
  * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
  */
class PlayerCharacter(val _name: String,
                      val _maxHP: Int,
                      val _attack: Int,
                      val _defense: Int,
                      val _evasion: Int,
                      private var _objective: String,
                      val randomNumberGenerator: Random = new Random()) extends Character with AUnit {

  /** Custom getters for fields */
  def name: String = _name

  def maxHP: Int = _maxHP

  def attack: Int = _attack

  def defense: Int = _defense

  def evasion: Int = _evasion


  /** The current health points (HP) of the player character.
   * If this value reaches or falls below 0, the player character is considered defeated.
   */
  private var _HP: Int = _maxHP

  /** Getter for the current health points (HP) of the player character.
   *
   * @return The current HP value.
   */
  def HP: Int = _HP

  /** Setter for the current health points (HP) of the player character.
   *
   * @param newHP The new HP value to set.
   */
  def HP_=(newHP: Int): Unit = {
    _HP = newHP
  }



  /** Getter for the objective of the character.
   *
   * @return The current objective.
   */
  def objective: String = _objective

  /** Setter for the objective of the character.
   *
   * @param newObjective The new objective value to set.
   */
  def objective_=(newObjective: String): Unit = {
    _objective = newObjective
  }

  /** Checks if the player character is alive.
   *
   * @return `true` if the player character's HP is greater than 0, `false` otherwise.
   */
  def isAlive(): Boolean = {
    _HP > 0
  }

  /** The number of stars collected by the player character.
   * Stars are typically obtained during gameplay and may have various uses.
   */
  protected var stars: Int = 0

  /** Rolls a dice and returns a value between 1 to 6.
   *
   * @return An integer between 1 and 6, inclusive.
   */
  def rollDice(): Int = {
    randomNumberGenerator.nextInt(6) + 1
  }

  /** Begins a tournament chapter and awards stars based on the number of chapters.
   * This method is part of the gameplay mechanics.
   *
   * @param Chapters The number of chapters to start.
   * @return `true` if the operation was successful, `false` if the provided chapter count is negative.
   */
  def beginTourn(Chapters: Int): Boolean = {

    if (Chapters < 0){
      false
    }
    else {
      stars += Chapters / 5 + 1
      true
    }
  }

  /** The number of victories achieved by the player character.
   * Victories can be obtained through battles in the game.
   */
  private var victories: Int = 0

  /** Engages in a battle with an enemy game unit.
   *
   * @param Enemy The enemy game unit to battle against.
   * @return `true` if the battle was successful, `false` otherwise.
   */
  def battle(Enemy: GameUnit): Boolean = {

  }

  private var recoveryAmount: Int = 6

  /** Performs a recovery action, typically based on the outcome of rolling a dice.
   *
   * @return `true` if the recovery action was successful, `false` otherwise.
   */
  def recovery(): Boolean = {
    /** For now we are just gonna return a Boolean */
    if (rollDice() > recoveryAmount) {
      true
    }
    true
  }

  /** The current norma level of the player character.
   * Norma levels represent the player's progression in the game.
   * We start at the first norm by default.
   */
  var Norma: NormX = new NormX(2, 10, 1)

  /** A method when the chapters end */
  def endChapter(): Boolean = {
    /** For now we are just gonna return a Boolean */
    recoveryAmount = recoveryAmount - 1
    true
  }


}


