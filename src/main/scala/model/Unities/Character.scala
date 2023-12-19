package cl.uchile.dcc.citric
package model.Unities

import model.Norm.NormX

/**
 * The `Character` trait represents a game character in the Citric game.
 * It extends the `GameUnit` trait and adds additional properties and
 * behaviors specific to characters.
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 */
trait Character extends GameUnit {

  /**
   * The current number of stars possessed by the character.
   */
  var stars: Int

  /**
   * Rolls a dice to determine outcomes in the game.
   *
   * @return The result of rolling the dice as an integer.
   */
  def rollDice(): Int

  /**
   * Begins a tournament with a specified number of chapters.
   *
   * @param Chapters The number of chapters in the tournament.
   * @return `true` if the tournament was successfully started, otherwise `false`.
   */
  def beginTourn(Chapters: Int): Boolean

  /**
   * The current number of victories achieved by the character.
   */
  var victories: Int

  /**
   * Initiates a battle between the character and an enemy game unit.
   *
   * @param Enemy The enemy game unit to battle against.
   * @return `true` if the battle was successful, otherwise `false`.
   */
  def battle(Enemy: GameUnit): Boolean

  /**
   * The amount of recovery available to the character.
   */
  var recoveryAmount: Int

  /**
   * Attempts to recover the character's health.
   *
   * @return `true` if the character successfully recovers, otherwise `false`.
   */
  def recovery(): Boolean

  /**
   * The norma (set of rules) that the character is currently trying to achieve.
   */
  var Norma: NormX

  /**
   * Ends the current chapter in the game.
   *
   * @return `true` if the chapter ends successfully, otherwise `false`.
   */
  def endChapter(): Boolean

  /**
   * Objective of the character depending of its norm
   *  */
  var objective: String
}
