package cl.uchile.dcc.citric
package model.unities

/**
 * The `Chicken` class represents a specific type of wild unit in the Citric game, which is a chicken.
 * It extends the `AWildUnit` class and defines the chicken's attributes such as attack, defense, and evasion.
 *
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
class Chicken extends AbstractWildUnit(hp = 3) {

  /**
   * Attributes
   */
  val _name: String = "Chicken"
  val _maxHP: Int = 3
  val _attack: Int = -1
  val _defense: Int = -1
  val _evasion: Int = 1
  val _bonusStars: Int = 3



}

