package cl.uchile.dcc.citric
package model.Unities

import model.Norm.NormX


trait Character extends GameUnit {

  val maxHP: Int
  val attack: Int
  val defense: Int
  val evasion: Int

  var HP: Int
  def isAlive(): Boolean

  var stars: Int

  def rollDice(): Int
  def beginTourn(Chapters: Int): Boolean

  var victories: Int

  def battle(Enemy: GameUnit): Boolean

  var recoveryAmount: Int

  def recovery(): Boolean

  var Norma: NormX

  def endChapter(): Boolean
}
