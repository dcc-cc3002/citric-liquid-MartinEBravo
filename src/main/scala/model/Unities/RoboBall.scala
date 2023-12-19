package cl.uchile.dcc.citric
package model.Unities

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
class RoboBall extends AWildUnit {

  /**
   * The attack power of the RoboBall.
   */
  val attack: Int = -1

  /**
   * The defense power of the RoboBall.
   */
  val defense: Int = 1

  /**
   * The evasion ability of the RoboBall.
   */
  val evasion: Int = -1
}
