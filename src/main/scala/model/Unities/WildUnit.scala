package cl.uchile.dcc.citric
package model.Unities

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
   * The maximum hit points (HP) of the unit.
   */
  val maxHP: Int

  /**
   * The attack power of the unit.
   */
  val attack: Int

  /**
   * The defense power of the unit.
   */
  val defense: Int

  /**
   * The evasion ability of the unit.
   */
  val evasion: Int

  /**
   * The current hit points (HP) of the unit.
   */
  var HP: Int

  /**
   * Checks whether the wild unit is still alive.
   *
   * @return `true` if the wild unit has positive HP and is alive, otherwise `false`.
   */
  def isAlive(): Boolean

  /**
   * Represents a player character's defeat of this wild unit.
   *
   * @param player The player character defeating the wild unit.
   * @return `true` if the player character successfully defeats the wild unit, otherwise `false`.
   */
  def playerDefeat(player: PlayerCharacter): Boolean
}
