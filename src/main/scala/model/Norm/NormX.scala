package cl.uchile.dcc.citric
package model.Norm

import model.Unities.PlayerCharacter

class NormX (val name: Int,
             val stars: Int,
             val victories: Int) extends Norm {

  def normaCheck(player: PlayerCharacter): Boolean = {
    if (player.stars > stars || player.victories > victories){
      true
    }
    else false
  }

  def normaClear(player: PlayerCharacter): Boolean = {
    true
  }

}


