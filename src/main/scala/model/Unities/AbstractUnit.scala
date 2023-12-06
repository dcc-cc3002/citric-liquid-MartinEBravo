package cl.uchile.dcc.citric
package model.unities
import scala.util.Random

/**
 * The `AbstractUnit` class represents a generic unit in the game.
 * It defines the basic attributes and behavior that a unit can have.
 * It extends the `GameUnit` trait and provides a basic implementation of units' attributes and behaviors.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 */

abstract class AbstractUnit(private var _hp: Int) extends GameUnit {

  /**
   * Attributes
   */
  val _name: String
  val _maxHP: Int
  val _attack: Int
  val _defense: Int
  val _evasion: Int
  private var _stars: Int = 0

  /**
   * Getters and Setters
   */
  def name: String = _name
  def maxHP: Int = _maxHP
  def attack: Int = _attack
  def defense: Int = _defense
  def evasion: Int = _evasion
  def hp: Int = _hp
  def hp_=(newHP: Int): Unit = {
    _hp = Math.max(0, newHP)
  }

  def stars: Int = _stars
  def stars_= (newStars: Int): Unit = {
    _stars = Math.max(0, newStars)
  }

  /**
   * Checks if the unit is alive.
   *
   * @return true if the unit is alive, false otherwise.
   */
  def isAlive: Boolean = {
    this.hp > 0
  }

  /**
   * Gives the stars and victories to the winner of the battle.
   *
   * @param winner: The winner of the battle.
   */
  def defeated(winner: GameUnit): Unit = {
    if (!this.isAlive) {
      this.giveStars(winner)
      this.giveVictories(winner)
    }
  }

  /**
   * Rolls a dice and returns the result.
   * @return a random number between 1 and 6.
   */
  def rollDice: Int = {
    val randomNumberGenerator: Random = new Random()
    randomNumberGenerator.nextInt(6) + 1
  }

  /**
   * Attacks a target unit.
   *
   * @param target the unit to attack.
   *
   * @return the result of the attack.
   */
  def attacking(target: GameUnit): Unit = {
    if (this.isAlive && target.isAlive){
      target.defendOrEvade(this)
    }
  }

  /**
   * Defends from an attack.
   *
   * @param attacker the unit that is attacking.
   */
  def defend(attacker: GameUnit): Unit = {
    this.hp -= Math.max(1, attacker.rollDice + attacker.attack - this.rollDice - this.defense)
    this.hp = Math.max(0, this.hp)
  }

  /**
   * Evades an attack.
   *
   * @param attacker the unit that is attacking.
   */
  def evade(attacker: GameUnit): Unit = {
    if (attacker.rollDice + this.evasion <= this.rollDice + this.attack) {
      // The attack was successful
      this.hp -= Math.max(1, attacker.rollDice + attacker.attack)
      this.hp = Math.max(0, this.hp)
    }
  }

  /**
   * Defends or evades an attack.
   *
   * @param attacker the unit that is attacking.
   */
  def defendOrEvade(attacker: GameUnit): Unit = {
    // As we don't have a GUI, we can't ask the player to choose between defend or evade
    // So we will choose the best option for the player
    if (this.evasion > this.defense) {
      this.evade(attacker)
    } else {
      this.defend(attacker)
    }
  }




}
