package cl.uchile.dcc.citric
package model.unities
/**
 * The `GameUnit` trait represents a generic unit in the game.
 * It defines the basic attributes and behavior that a unit can have.
 *
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 */
trait GameUnit {

  /**
   * Attributes
   */
  val _maxHP: Int
  val _attack: Int
  val _defense: Int
  val _evasion: Int
  val _name: String

  /**
   * Getters and Setters
   */
  def hp: Int
  def hp_=(newHP: Int): Unit
  def maxHP: Int
  def attack: Int
  def defense: Int
  def evasion: Int
  def name: String

  /**
   * Checks if the unit is alive.
   *
   * @return true if the unit is alive, false otherwise.
   */
  def isAlive: Boolean

  /**
   * Attacks a target.
   * @param target: The target of the attack.
   */
  def attacking(target: GameUnit): Unit

  /**
   * Defends or evades an attack.
   * @param attacker: The unit that is attacking.
   */
  def defendOrEvade(attacker: GameUnit): Unit

  /**
   * Defends an attack.
   * @param attacker: The unit that is attacking.
   */
  def defend(attacker: GameUnit): Unit

  /**
   * Evades an attack.
   * @param attacker: The unit that is attacking.
   */
  def evade(attacker: GameUnit): Unit

  /**
   * Rolls a dice.
   *
   *
   * @return a random number between 1 and 6.
   */
  def rollDice: Int

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
   * Recieves the stars from the player character.
   *
   * @param player: The player character that lost the battle.
   */
  def recieveStarsFromPlayer(player: PlayerCharacter): Unit

  /**
   * Recieves the stars from the wild unit.
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
