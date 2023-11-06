  package cl.uchile.dcc.citric
  package model.unities

  import model.norma.{Norma, Norma2}

  import scala.annotation.unused

  /** The `PlayerCharacter` class represents a character or avatar in the game, encapsulating
    * several attributes such as health points, attack strength, defense capability,
    * and evasion skills. Each player has a unique name, and throughout the game,
    * players can collect stars, roll dice, and progress in levels known as 'norma'.
    * This class not only maintains the state of a player but also provides methods
    * to modify and interact with these attributes.
    *
    * For instance, players can:
   *
    * - Increase or decrease their star count.
   *
    * - Roll a dice, a common action in many board games.
   *
    * - Advance their norma level.
    *
    * Furthermore, the `Player` class has a utility for generating random numbers,
    * which is primarily used for simulating dice rolls. By default, this utility is
    * an instance of the `Random` class but can be replaced if different random
    * generation behaviors are desired.
    *
    * @param _name The name of the player. This is an identifier and should be unique.
    * @param _maxHP The maximum health points a player can have. It represents the player's endurance.
    * @param _attack The player's capability to deal damage to opponents.
    * @param _defense The player's capability to resist or mitigate damage from opponents.
    * @param _evasion The player's skill to completely avoid certain attacks.
    *
    * @author [[https://github.com/danielRamirezL/ Daniel Ramírez L.]]
    * @author [[https://github.com/joelriquelme/ Joel Riquelme P.]]
    * @author [[https://github.com/r8vnhill/ Ignacio Slater M.]]
    * @author [[https://github.com/Seivier/ Vicente González B.]]
    * @author [[https://github.com/MartinEBravo/ Martín E. Bravo]]
    */
  class PlayerCharacter(val _name: String,
                        val _maxHP: Int,
                        val _attack: Int,
                        val _defense: Int,
                        val _evasion: Int)
    extends AbstractUnit(_hp=_maxHP) with Character  {


    /**
    * Parameters
    */

    private var _victories: Int = 0
    private var _norma: Norma = new Norma2

    /**
     * Getters and Setters
     */
    def victories: Int = _victories
    def victories_=(newVictories: Int): Unit = {
      _victories = newVictories
    }
    def norma: Norma = _norma
    def norma_=(newNorma: Norma): Unit = {
      _norma = newNorma
    }


    /**
    * NormaCheck effect to the player
    */
    def normaCheck(): Unit = {
      norma = norma.nextNorma
    }

    /**
    * Give stars to the winner of a battle
    */
    def giveStars(winner: GameUnit): Unit = {
      winner.recieveStarsFromPlayer(this)
      this.stars = this.stars / 2
    }

    /**
    * Give victories to the winner of a battle
    */
    def giveVictories(winner: GameUnit): Unit = {
      winner.recieveVictoriesFromPlayer(this);
    }

    /**
    * Recieve stars from a player
    */
    def recieveStarsFromPlayer(player: PlayerCharacter): Unit = {
      this.stars = this.stars + player.stars / 2
    }

    /**
     * Recieve stars from a wild unit
     */
    def recieveStarsFromWildUnit(wildUnit: WildUnit): Unit = {
      this.stars = this.stars + wildUnit.stars + wildUnit.bonusStars
    }
    /**
    * Recieve victories from a player
    */
    def recieveVictoriesFromPlayer(player: PlayerCharacter): Unit = {
      this.victories = this.victories + 2
    }

    /**
     * Recieve victories from a wild unit
     */
    def recieveVictoriesFromWildUnit(wildUnit: WildUnit): Unit = {
      this.victories = this.victories + 1
    }
  }