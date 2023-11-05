package cl.uchile.dcc.citric
package model.Norm

import model.Unities.PlayerCharacter

/**
 * The `Norm` trait represents a set of rules or conditions that a player character must meet
 * in a game. It defines the basic structure for norms in the game, including their name,
 * required stars, and required victories.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
trait Norm {

  /**
   * The name or identifier of the norm.
   */
  private var _name: Int = 0

  /**
   * The number of stars required to clear this norm.
   */
  private var _stars: Int = 0

  /**
   * The number of victories required to clear this norm.
   */
  private var _victories: Int = 0

  /** Getter for the name property */
  def name: Int = _name

  /** Setter for the name property */
  def name_=(newName: Int): Unit

  /** Getter for the stars property */
  def stars: Int = _stars

  /** Setter for the stars property */
  def stars_=(newStars: Int): Unit

  /** Getter for the victories property */
  def victories: Int = _victories

  /** Setter for the victories property */
  def victories_=(newVictories: Int): Unit

  /**
   * Checks whether a player character meets the requirements of this norm.
   *
   * @param player The player character whose statistics are being checked.
   * @return `true` if the player meets the norm's requirements, otherwise `false`.
   */
  def normaCheck(player: PlayerCharacter): Boolean

  /**
   * Indicates whether the player character has upgraded their norm.
   *
   * @param player The player character whose progress is being checked.
   */
  def normaClear(player: PlayerCharacter): Unit
}
