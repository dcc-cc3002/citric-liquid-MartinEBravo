package cl.uchile.dcc.citric
package model.Norm

import model.Unities.PlayerCharacter

trait Norm {

  val name: Int
  val stars: Int
  val victories: Int
  def normaCheck(player: PlayerCharacter): Boolean
  def normaClear(player: PlayerCharacter): Boolean
}
