package cl.uchile.dcc.citric
package model.unities.wildunities

import model.unities.character.PlayerCharacter

class ChickenTest extends munit.FunSuite {

  private var chicken: Chicken = _

  override def beforeEach(context: BeforeEach): Unit = {
    chicken = new Chicken
  }

  test("Chicken's attributes are correct") {
    assertEquals(chicken.name, "Chicken")
    assertEquals(chicken.hp, 3)
    assertEquals(chicken.maxHP, 3)
    assertEquals(chicken.attack, -1)
    assertEquals(chicken.defense, -1)
    assertEquals(chicken.evasion, 1)
    assertEquals(chicken.bonusStars, 3)
    assertEquals(chicken.stars, 0)
  }

  test("A Chicken should give stars correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    chicken.giveStars(player)
    assertEquals(player.stars, 3)
    assertEquals(chicken.stars, 0)
  }

  test("A Chicken should give victories correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    chicken.giveVictories(player)
    assertEquals(player.victories, 1)
  }
  test("A Chicken should recieve stars correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    player.stars = 4
    chicken.recieveStarsFromPlayer(player)
    assertEquals(chicken.stars, 2)
  }
  test("A Chicken should be defeated correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    chicken.hp = 0
    chicken.defeated(player)
    assertEquals(player.victories, 1)
  }
  test("A Chicken should not recieve stars and victories from other WildUnits"){
    val chicken2 = new Chicken
    chicken2.stars = 4
    chicken2.giveStars(chicken)
    assertEquals(chicken.stars, 0)
  }
  test("A Chicken should be checked if it is alive correctly"){
    assertEquals(chicken.isAlive, true)
    chicken.hp = 0
    assertEquals(chicken.isAlive, false)
  }
  test("A Chicken should roll a dice correctly"){
    for (i <- 1 to 100){
      val dice = chicken.rollDice
      assert(dice >= 1 && dice <= 6)
    }
  }
  test("A Chicken should attack correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    chicken.attacking(player)
    assert(player.hp != 4)
  }
  test("A Chicken should not attack if it is dead"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    chicken.hp = 0
    chicken.attacking(player)
    assert(player.hp == 4)
  }
  test("A Chicken should not attack if the target is dead"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    player.hp = 0
    chicken.attacking(player)
    assert(player.hp == 0)
  }
  test("A Chicken should defend correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    chicken.defend(player)
    assert(chicken.hp != 3)
  }
  test("A Chicken should evade correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    chicken.evade(player)
    assert(chicken.hp >= 0)
  }
}
