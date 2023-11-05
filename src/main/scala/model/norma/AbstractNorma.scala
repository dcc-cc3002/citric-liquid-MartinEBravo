package cl.uchile.dcc.citric
package model.norma

/**
 * The `AbstractNorma` class represents a specific type of norm in the game.
 * It defines the requirements for players to meet in terms of stars and victories to clear this norm.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 */
abstract class AbstractNorma extends Norma {

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
  def stars: Int = _stars
  def victories: Int = _victories
  def normaNumber: Int = _normaNumber
  def nextNorma: Norma = _nextNorma

}
