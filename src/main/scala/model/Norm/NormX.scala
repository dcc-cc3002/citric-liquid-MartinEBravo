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
class NormX(val name: Int, val stars: Int, val victories: Int) extends Norm {

  /**
   * Checks whether a player's statistics meet the requirements of this norm.
   *
   * @param player The player character whose statistics are being checked.
   * @return `true` if the player meets the norm's requirements, otherwise `false`.
   */
  def normaCheck(player: PlayerCharacter): Boolean = {
    if (player.stars > stars || player.victories > victories) {
      true
    } else {
      false
    }
  }

  /**
   * Indicates whether the player has cleared this norm.
   *
   * @param player The player character whose progress is being checked.
   * @return `true` if the player has cleared this norm, always returns `true` in this implementation.
   */
  def normaClear(player: PlayerCharacter): Boolean = {
    true
  }
}
