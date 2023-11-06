package cl.uchile.dcc.citric
package model.Unities

/**
 * The `Chicken` class represents a specific type of wild unit in the Citric game, which is a chicken.
 * It extends the `AWildUnit` class and defines the chicken's attributes such as attack, defense, and evasion.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
class Chicken extends AWildUnit {

  /**
   * The attack power of the chicken.
   */
  private val _attack: Int = -1

  /**
   * The defense power of the chicken.
   */
  private val _defense: Int = -1

  /**
   * The evasion ability of the chicken.
   */
  private val _evasion: Int = 1

  /** Custom getter for _attack. */
  def attack: Int = _attack

  /** Custom getter for _defense. */
  def defense: Int = _defense

  /** Custom getter for _evasion. */
  def evasion: Int = _evasion
}

