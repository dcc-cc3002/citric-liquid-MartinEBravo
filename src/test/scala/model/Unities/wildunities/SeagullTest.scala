package cl.uchile.dcc.citric
package model.unities.wildunities

import model.unities.character.PlayerCharacter

class SeagullTest extends munit.FunSuite {

  private var seagull: Seagull = _

  override def beforeEach(context: BeforeEach): Unit = {
    seagull = new Seagull
  }

  test("Seagull's attributes are correct") {
    assertEquals(seagull.name, "Seagull")
    assertEquals(seagull.hp, 3)
    assertEquals(seagull.maxHP, 3)
    assertEquals(seagull.attack, 1)
    assertEquals(seagull.defense, -1)
    assertEquals(seagull.evasion, -1)
    assertEquals(seagull.bonusStars, 2)
    assertEquals(seagull.stars, 0)
  }

  test("A Seagull should be defeated correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    seagull.hp = 0
    seagull.defeated(player)
    assertEquals(player.victories, 1)
  }

  test("A Seagull should give stars correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    seagull.giveStars(player)
    assertEquals(player.stars, 2)
    assertEquals(seagull.stars, 0)
  }

  test("A Seagull should give victories correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    seagull.giveVictories(player)
    assertEquals(player.victories, 1)
  }

  test("A Seagull should recieve stars correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    player.stars = 4
    seagull.recieveStarsFromPlayer(player)
    assertEquals(seagull.stars, 2)
  }

  test("A Seagull should not recieve stars and victories from other WildUnits"){
    val seagull2 = new Seagull
    seagull2.stars = 4
    seagull2.giveStars(seagull)
    assertEquals(seagull.stars, 0)
  }

  test("A Seagull should be checked if it is alive correctly") {
    assertEquals(seagull.isAlive, true)
    seagull.hp = 0
    assertEquals(seagull.isAlive, false)
  }

  test("A Seagull should roll a dice correctly"){
    for (i <- 1 to 100){
      val dice = seagull.rollDice
      assert(dice >= 1 && dice <= 6)
    }
  }

  test("A Seagull should attack correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    seagull.attacking(player)
    assert(player.hp != 4)
  }
  test("A Seagull should not attack if it is dead"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    seagull.hp = 0
    seagull.attacking(player)
    assert(player.hp == 4)
  }
  test("A Seagull should not attack if the target is dead"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    player.hp = 0
    seagull.attacking(player)
    assert(player.hp == 0)
  }
  test("A Seagull should defend correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    seagull.defend(player)
    assert(seagull.hp != 3)
  }
  test("A Seagull should evade correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    seagull.evade(player)
    assert(seagull.hp >= 0)
  }
}
