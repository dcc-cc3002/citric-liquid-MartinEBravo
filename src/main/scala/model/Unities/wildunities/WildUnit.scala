package cl.uchile.dcc.citric
package model.unities.wildunities

import model.unities.GameUnit
import model.unities.character.PlayerCharacter

/**
 * The `WildUnit` trait represents a wild or non-player character unit in the Citric game.
 * It extends the `GameUnit` trait and defines attributes and behaviors specific to wild units.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
trait WildUnit extends GameUnit {

  /**
   * Attributes
   */
  val _attack: Int
  val _defense: Int
  val _evasion: Int
  val _bonusStars: Int

  /**
   * Getters and Setters
   */
  def attack: Int
  def defense: Int
  def evasion: Int
  def bonusStars: Int
  def stars: Int

  /**
   * Rolls a dice and returns the result.
   *
   */
  def rollDice: Int

  /**
   * Attacks a target unit.
   *
   * @param target: The unit to be attacked.
   */
  def attacking(target: GameUnit): Unit

  /**
   * Defends or evades an attack from an attacker unit.
   *
   * @param attacker: The unit that is attacking.
   */
  def defendOrEvade(attacker: GameUnit): Unit

  /**
   * Defends an attack from an attacker unit.
   *
   * @param attacker: The unit that is attacking.
   */
  def defend(attacker: GameUnit): Unit

  /**
   * Evades an attack from an attacker unit.
   *
   * @param attacker: The unit that is attacking.
   */
  def evade(attacker: GameUnit): Unit

  /**
   * Gives the stars and victories to the winner of the battle.
   */
  def defeated(winner: GameUnit): Unit

  /**
   * Gives the stars to the winner of the battle.
   *
   * @param winner: The winner of the battle.
   */
  def giveStars(winner: GameUnit): Unit

  /**
   * Gives the victories to the winner of the battle.
   *
   * @param winner: The winner of the battle.
   */
  def giveVictories(winner: GameUnit): Unit

  /**
   * Recieves the victories from the player character.
   *
   * @param player: The player character that lost the battle.
   */
  def recieveStarsFromPlayer(player: PlayerCharacter): Unit

  /**
   * Recieves the victories from the wild unit.
   *
   * @param wildUnit: The wild unit that lost the battle.
   */
  def recieveVictoriesFromWildUnit(wildUnit: WildUnit): Unit

  /**
   * Recieves the stars from the wild unit.
   *
   * @param wildUnit: The wild unit that lost the battle.
   */
  def recieveStarsFromWildUnit(wildUnit: WildUnit): Unit

  /**
   * Recieves the victories from the player character.
   *
   * @param player: The player character that lost the battle.
   */
  def recieveVictoriesFromPlayer(player: PlayerCharacter): Unit


}
