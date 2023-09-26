package cl.uchile.dcc.citric
package model.Unities

/**
 * The `GameUnit` trait represents a generic unit in the game.
 * It defines the basic attributes and behavior that a unit can have.
 *
 * A GameUnit can:
 *
 * - Check if the unit is alive
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 */
trait GameUnit {

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
   * Checks whether the unit is still alive.
   *
   * @return `true` if the unit has positive HP and is alive, otherwise `false`.
   */
  def isAlive(): Boolean
}
