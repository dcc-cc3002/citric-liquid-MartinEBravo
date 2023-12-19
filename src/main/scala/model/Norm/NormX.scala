package cl.uchile.dcc.citric
package model.Norm

import model.Unities.PlayerCharacter

/**
 * The `NormX` class represents a specific type of norm in the game.
 * It defines the requirements for players to meet in terms of stars and victories to clear this norm.
 *
 * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
 * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
 * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
 * @author [[https://github.com/Seivier/ Vicente González B.]]
 * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
 *
 *
 * @param name      The name or identifier of this norm.
 * @param stars     The number of stars required to clear this norm.
 * @param victories The number of victories required to clear this norm.
 */
class NormX(var name: Int, var stars: Int, var victories: Int) extends Norm {

  /**
   * Checks whether a player's statistics meet the requirements of this norm.
   *
   * @param player The player character whose statistics are being checked.
   * @return `true` if the player meets the norm's requirements, otherwise `false`.
   */
  def normaCheck(player: PlayerCharacter): Boolean = {
    if (player.objective == "Stars") {
      if (player.stars > player.Norma.stars){
        true
      }
    }
    else{
      if (player.victories > player.Norma.victories) {
        true
      }
    }
    false
  }

  /**
   * Indicates whether the player has upgrade his norm.
   *
   * @param player The player character whose progress is being checked.
   */
  def normaClear(player: PlayerCharacter): Unit = {
    name = name+1

    /** Here we upgrade the level of the Norma */
    if (name == 3){
      stars = 30
      victories = 3
    }
    else if (name == 4) {
      stars = 70
      victories = 6
    }
    else if (name == 5) {
      stars = 120
      victories = 10
    }
    else if (name == 6) {
      stars = 200
      victories = 14
    }
  }
}
