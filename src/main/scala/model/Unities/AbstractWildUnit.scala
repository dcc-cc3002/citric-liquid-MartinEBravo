package cl.uchile.dcc.citric
package model.unities

/**
 * The `AbstractWildUnit` class represents an abstract wild unit in the Citric game.
 * It extends the `WildUnit` trait and provides a basic implementation of wild units' attributes and behaviors.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
abstract class AbstractWildUnit extends AbstractUnit with WildUnit {

  /**
   * Attributes
   */
  val _name: String
  val _attack: Int
  val _defense: Int
  val _evasion: Int
  val _bonusStars: Int
  var _stars: Int
  var _hp: Int


  /**
   * Getters and Setters
   */
  def name: String = _name
  def maxHP: Int = _maxHP
  def attack: Int = _attack
  def defense: Int = _defense
  def evasion: Int = _evasion
  def hp: Int = _hp
  def stars: Int = _stars
  def stars_=(newStars: Int): Unit = _stars = newStars
  def bonusStars: Int = _bonusStars



  /**
   * Gives the stars to the winner of the battle.
   *
   * @param winner: The winner of the battle.
   */
  def giveStars(winner: GameUnit): Unit = {
    winner.recieveStarsFromWildUnit(this)
    stars = 0
  }

  /**
   * Gives the victories to the winner of the battle.
   *
   * @param winner: The winner of the battle.
   */
  def giveVictories(winner: GameUnit): Unit = {
    winner.recieveVictoriesFromWildUnit(this)
  }

  /**
   * Recieves the victories from the player character.
   *
   * @param player: The player character that lost the battle.
   */
  def recieveStarsFromPlayer(player: PlayerCharacter): Unit = {
    this.stars = this.stars + player.stars/2
  }

  /**
   * Recieves the victories from the wild unit.
   *
   * @param wildUnit: The wild unit that lost the battle.
   */
  def recieveStarsFromWildUnit(wildUnit: WildUnit): Unit = {
    // WildUnits can't fight each other
  }

  /**
   * Recieves the victories from the player character.
   *
   * @param player: The player character that lost the battle.
   */
  def recieveVictoriesFromPlayer(player: PlayerCharacter): Unit = {
    // WildUnits can't recieve victories
  }

  /**
   * Recieves the victories from the wild unit.
   *
   * @param wildUnit: The wild unit that lost the battle.
   */
  def recieveVictoriesFromWildUnit(wildUnit: WildUnit): Unit = {
    // WildUnits can't recieve victories and fight each other
  }
}

