package cl.uchile.dcc.citric
package model.Unities

/**
 * The `AWildUnit` class represents an abstract wild unit in the Citric game.
 * It extends the `WildUnit` trait and provides a basic implementation of wild units' attributes and behaviors.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
abstract class AWildUnit extends WildUnit with AUnit {
  /**
   * The maximum hit points (HP) of the wild unit, which is 3 by default.
   */
  val maxHP: Int = 3

  /**
   * The current hit points (HP) of the wild unit, initially set to 3.
   */
  private var _HP: Int = 3

  /**
   * Getter for the current hit points (HP) of the wild unit.
   *
   * @return The current HP value.
   */
  def HP: Int = _HP

  /**
   * Setter for the current hit points (HP) of the wild unit.
   *
   * @param newHP The new HP value to set.
   */
  def HP_=(newHP: Int): Unit = {
    _HP = newHP
  }

  /**
   * Checks whether the wild unit is still alive.
   *
   * @return `true` if the wild unit has positive HP and is alive, otherwise `false`.
   */
  def isAlive(): Boolean = {
    _HP > 0
  }

  /**
   * Represents a player character's defeat of this wild unit.
   *
   * @param player The player character defeating the wild unit.
   * @return `true` if the player character successfully defeats the wild unit, otherwise `false`.
   */
  def playerDefeat(player: PlayerCharacter): Boolean = {
    /** For now we are just gonna return a Boolean */
    true
  }
}

