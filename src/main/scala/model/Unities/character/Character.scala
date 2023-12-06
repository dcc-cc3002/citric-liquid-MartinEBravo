package cl.uchile.dcc.citric
package model.unities.character

import model.norma.Norma
import model.unities.GameUnit
import cl.uchile.dcc.citric.model.unities.wildunities.WildUnit

/**
 * The `Character` trait represents a game character in the Citric game.
 * It extends the `GameUnit` trait and adds additional properties and
 * behaviors specific to characters.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
trait Character extends GameUnit {

  /**
   * Attributes
   */
  val _attack: Int
  val _defense: Int
  val _evasion: Int
  val _name: String

  /**
   * Getters and Setters
   */
  def stars: Int
  def norma: Norma
  def hp: Int
  def maxHP: Int
  def attack: Int
  def defense: Int
  def evasion: Int
  def name: String
  def stars_=(newStars: Int): Unit


  def attacking(target: GameUnit): Unit
  def defendOrEvade(attacker: GameUnit): Unit
  def defend(attacker: GameUnit): Unit
  def evade(attacker: GameUnit): Unit


  /**
   * Checks if the unit is alive.
   *
   * @return true if the unit is alive, false otherwise.
   */
  def isAlive: Boolean

  /**
   * Rolls a dice.
   *
   * @return a random number between 1 and 6.
   */
  def rollDice: Int

  /**
   * Gives the stars and victories to the winner of the battle.
   * */
  def defeated(winner: GameUnit): Unit

  /**
   * Gives the stars to the winner of the battle.
   * @param winner: The winner of the battle.
   */
  def giveStars(winner: GameUnit): Unit

  /**
   * Gives the victories to the winner of the battle.
   * @param winner: The winner of the battle.
   */
  def giveVictories(winner: GameUnit): Unit

  /**
   * Recieves the stars from the player character.
   * @param player: The player character that lost the battle.
   */
  def recieveStarsFromPlayer(player: PlayerCharacter): Unit

  /**
   * Recieves the victories from the wild unit.
   * @param wildUnit: The wild unit that lost the battle.
   */
  def recieveVictoriesFromWildUnit(wildUnit: WildUnit): Unit

  /**
   * Recieves the stars from the wild unit.
   * @param wildUnit: The wild unit that lost the battle.
   */
  def recieveStarsFromWildUnit(wildUnit: WildUnit): Unit

  /**
   * Recieves the victories from the player character.
   * @param player: The player character that lost the battle.
   */
  def recieveVictoriesFromPlayer(player: PlayerCharacter): Unit
}
