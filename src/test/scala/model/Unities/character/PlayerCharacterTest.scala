package cl.uchile.dcc.citric
package model.unities.character

import model.unities.wildunities.Chicken

import cl.uchile.dcc.citric.controller.GameController


class PlayerCharacterTest extends munit.FunSuite {

  private var player: PlayerCharacter = _

  override def beforeEach(context: BeforeEach): Unit = {
    player = new PlayerCharacter("Player", 4, 1, 1, 1)
  }

  test("PlayerCharacter's attributes are correct") {
    assertEquals(player.name, "Player")
    assertEquals(player.hp, 4)
    assertEquals(player.maxHP, 4)
    assertEquals(player.attack, 1)
    assertEquals(player.defense, 1)
    assertEquals(player.evasion, 1)
    assertEquals(player.stars, 0)
    assertEquals(player.victories, 0)
  }

  test("A PlayerCharacter should do NormaCheck correctly"){
    assertEquals(player.norma.normaNumber, 2)
    player.victories = 1
    player.normaCheck()
    assertEquals(player.norma.normaNumber, 3)
    player.victories = 3
    player.normaCheck()
    assertEquals(player.norma.normaNumber, 4)
    player.victories = 6
    player.normaCheck()
    assertEquals(player.norma.normaNumber, 5)
    player.victories = 10
    player.normaCheck()
    assertEquals(player.norma.normaNumber, 6)
    player.victories = 14
    player.normaCheck()
    assertEquals(player.norma.normaNumber, 6)
  }
  test("A PlayerCharacter should be defeated correctly"){
    val player2 = new PlayerCharacter("Player2", 4, 1, 1, 1)
    player.hp = 0
    player.defeated(player2)
    assertEquals(player2.victories, 2)
  }
  test("A PlayerCharacter should give stars correctly"){
    val player2 = new PlayerCharacter("Player2", 4, 1, 1, 1)
    player.giveStars(player2)
    assertEquals(player2.stars, 0)
  }

  test("A PlayerCharacter should give victories correctly"){
    val player2 = new PlayerCharacter("Player2", 4, 1, 1, 1)
    player.giveVictories(player2)
    assertEquals(player2.victories, 2)
  }

  test("A PlayerCharacter should recieve stars correctly"){
    val player2 = new PlayerCharacter("Player2", 4, 1, 1, 1)
    player2.stars = 4
    player.recieveStarsFromPlayer(player2)
    assertEquals(player.stars, 2)
  }

  test("A PlayerCharacter should recieve victories correctly"){
    val player2 = new PlayerCharacter("Player2", 4, 1, 1, 1)
    player2.victories = 4
    player.recieveVictoriesFromPlayer(player2)
    assertEquals(player.victories, 2)
  }

  test("A PlayerCharacter should recieve stars correctly from a WildUnit"){
    val chicken = new Chicken
    player.recieveStarsFromWildUnit(chicken)
    assertEquals(player.stars, 3)
    assertEquals(chicken.stars, 0)
  }

  test("A PlayerCharacter should recieve stars correctly from a WildUnit"){
    val chicken = new Chicken
    player.recieveVictoriesFromWildUnit(chicken)
    assertEquals(player.victories, 1)
  }

  test("A PlayerCharacter should be checked if it is alive correctly"){
    assertEquals(player.isAlive, true)
    player.hp = 0
    assertEquals(player.isAlive, false)
  }

  test("A PlayerCharacter should roll a dice correctly"){
    for (_ <- 1 to 100){
      val dice = player.rollDice
      assert(dice >= 1 && dice <= 6)
    }
  }

  test("A PlayerCharacter should attack correctly"){
    val chicken = new Chicken
    player.attacking(chicken)
    assert(chicken.hp != 2)
  }
  test("A PlayerCharacter should not attack if it is dead"){
    val chicken = new Chicken
    player.hp = 0
    player.attacking(chicken)
    assert(chicken.hp == 3)
  }
  test("A PlayerCharacter should defend correctly"){
    val chicken = new Chicken
    player.defend(chicken)
    assert(player.hp != 4)
  }
  test("A PlayerCharacter should evade correctly"){
    val chicken = new Chicken
    player.evade(chicken)
    assert(player.hp >= 0)
  }
  test("Observer should be notified correctly"){
    // new controller
    val controller = new GameController
    // add observer
    player.registerObserver(controller)
    //notify observer
    player.notifyObservers()
    // check if observer was notified
    assert(controller.update(player))
  }

}
