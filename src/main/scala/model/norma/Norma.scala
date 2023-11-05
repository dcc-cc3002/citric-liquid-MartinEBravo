package cl.uchile.dcc.citric
package model.norma

/**
 * The `Norma` trait represents a set of rules or conditions that a player character must meet
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
trait Norma {

  /**
   * Attributes
   */
  val _stars: Int
  val _victories: Int
  val _normaNumber: Int
  val _nextNorma: Norma

  /**
   * Getters and Setters
   */
  def stars: Int
  def victories: Int
  def normaNumber: Int
  def nextNorma: Norma
}
