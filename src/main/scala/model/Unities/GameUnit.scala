package cl.uchile.dcc.citric
package model.Unities

trait GameUnit {

  val maxHP: Int
  val attack: Int
  val defense: Int
  val evasion: Int

  var HP: Int
  def isAlive(): Boolean
}
