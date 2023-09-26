package cl.uchile.dcc.citric
package model.Unities


abstract class AWildUnit extends WildUnit {
  val maxHP: Int = 3
  var HP: Int = 3
  def isAlive(): Boolean = {
    if (HP <= 0) {
      false
    }
    else true
  }
  def playerDefeat(player: PlayerCharacter): Boolean = {
    true
  }



}
