package cl.uchile.dcc.citric
package model.Unities

class AUnit extends GameUnit {
  def attack(player: PlayerCharacter): Unit = {
    // Código para el ataque
    val isDefending: Bool = True

    if (isDefending) {
      player.defend(this)
    }
    else {
      player.evade(this)
    }
  }

  def defend(player: PlayerCharacter): Unit = {
    val rolldef: Int = player.rollDice()
    val rollatk: Int = this.rollDice()
    this.HP_(max(1,rollatk+this.attack-(rolldef+this.defense)))
  }

  def evade(player: PlayerCharacter): Unit = {
    // Código para evadir
    val rolldef: Int = player.rollDice()
    val rollatk: Int = this.rollDice()
    if (rolldef + this.evasion > rollatk + this.attack){
      () // do nothing
    }
    else{
      player.defend(this)
    }
  }
}
