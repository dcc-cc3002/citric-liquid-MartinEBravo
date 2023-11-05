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
 * @param _name      The name or identifier of this norm.
 * @param _stars     The number of stars required to clear this norm.
 * @param _victories The number of victories required to clear this norm.
 */
class NormX(private var _name: Int, private var _stars: Int, private var _victories: Int) extends Norm {

  /** Return the current norma level */
  def name: Int = _name

  /** Updates the current norma level
   *
   * @param newName The new norma level
   * */
  def name_(newName: Int): Unit = {
    _name = newName
  }

  /** Return the number of stars required to clear this norm */
  def stars: Int = _stars

  /** Updates the number of stars required to clear this norm
   *
   * @param newStars The new number of stars required
   * */
  def stars_=(newStars: Int): Unit = {
    _stars = newStars
  }

  /** Return the number of victories required to clear this norm */
  def victories: Int = _victories

  /** Updates the number of victories required to clear this norm
   *
   * @param newVictories The new number of victories required
   * */
  def victories_=(newVictories: Int): Unit = {
    _victories = newVictories
  }

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
   * Indicates whether the player has upgraded their norm.
   *
   * @param player The player character whose progress is being checked.
   */
  def normaClear(player: PlayerCharacter): Unit = {
    _name = _name + 1

    /** Here we upgrade the level of the Norma */
    if (_name == 3) {
      stars_=(30)
      victories_=(3)
    } else if (_name == 4) {
      stars_=(70)
      victories_=(6)
    } else if (_name == 5) {
      stars_=(120)
      victories_=(10)
    } else if (_name == 6) {
      stars_=(200)
      victories_=(14)
    }
  }

}
