package cl.uchile.dcc.citric
package model.unities
class RoboBallTest extends munit.FunSuite {

  private var roboBall: RoboBall = _

  override def beforeEach(context: BeforeEach): Unit = {
    roboBall = new RoboBall
  }

  test("RoboBall's attributes are correct") {
    assertEquals(roboBall.name, "RoboBall")
    assertEquals(roboBall.hp, 3)
    assertEquals(roboBall.maxHP, 3)
    assertEquals(roboBall.attack, -1)
    assertEquals(roboBall.defense, 1)
    assertEquals(roboBall.evasion, -1)
    assertEquals(roboBall.bonusStars, 2)
    assertEquals(roboBall.stars, 0)
  }

  test("A RoboBall should be defeated correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    roboBall.hp = 0
    roboBall.defeated(player)
    assertEquals(player.victories, 1)
  }

  test("A RoboBall should give stars correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    roboBall.giveStars(player)
    assertEquals(player.stars, 2)
    assertEquals(roboBall.stars, 0)
  }

  test("A RoboBall should give victories correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    roboBall.giveVictories(player)
    assertEquals(player.victories, 1)
  }

  test("A RoboBall should recieve stars correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    player.stars = 4
    roboBall.recieveStarsFromPlayer(player)
    assertEquals(roboBall.stars, 2)
  }

  test("A RoboBall should not recieve stars and victories from other WildUnits"){
    val roboBall2 = new RoboBall
    roboBall2.stars = 4
    roboBall2.giveStars(roboBall)
    assertEquals(roboBall.stars, 0)
    roboBall2.giveVictories(roboBall)
  }

  test("A RoboBall should not recieve victories from a PlayerCharacter"){
    val player = new PlayerCharacter("Player", 4, 1, 1, 1)
    player.victories = 4
    roboBall.recieveVictoriesFromPlayer(player)
  }

  test("A RoboBall should be checked if it is alive correctly"){
    assertEquals(roboBall.isAlive, true)
    roboBall.hp = 0
    assertEquals(roboBall.isAlive, false)
  }

  test("A RoboBall should roll a dice correctly"){
    for (i <- 1 to 100){
      val dice = roboBall.rollDice
      assert(dice >= 1 && dice <= 6)
    }
  }

  test("A RoboBall should attack correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    roboBall.attacking(player)
    assert(player.hp != 4)
  }

  test("A RoboBall should not attack if it is dead"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    roboBall.hp = 0
    roboBall.attacking(player)
    assert(player.hp == 4)
  }

  test("A RoboBall should not attack if the target is dead"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    player.hp = 0
    roboBall.attacking(player)
    assert(player.hp == 0)
  }

  test("A RoboBall should defend correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    roboBall.defend(player)
    assert(roboBall.hp != 3)
  }

  test("A RoboBall should evade correctly"){
    val player = new PlayerCharacter("Player", 4, 1, 2, 1)
    roboBall.evade(player)
    assert(roboBall.hp >= 0)
  }





}
