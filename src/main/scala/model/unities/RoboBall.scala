package cl.uchile.dcc.citric
package model.unities

/**
 * The `RoboBall` class represents a specific type of wild unit in the Citric game, which is a RoboBall.
 * It extends the `AWildUnit` class and defines the RoboBall's attributes such as attack, defense, and evasion.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *
 */
class RoboBall extends AbstractWildUnit {

  /**
   * Attributes
   */
  var _hp = 3
  var _stars = 0
  val _name: String = "RoboBall"
  val _maxHP: Int = 3
  val _attack: Int = -1
  val _defense: Int = 1
  val _evasion: Int = -1
  val _bonusStars: Int = 2



}
