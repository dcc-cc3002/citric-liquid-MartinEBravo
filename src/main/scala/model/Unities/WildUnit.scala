package cl.uchile.dcc.citric
package model.Unities

trait WildUnit extends GameUnit{

  val maxHP: Int
  val attack: Int
  val defense: Int
  val evasion: Int

  var HP: Int

  def isAlive(): Boolean

  def playerDefeat(player: PlayerCharacter): Boolean
}
