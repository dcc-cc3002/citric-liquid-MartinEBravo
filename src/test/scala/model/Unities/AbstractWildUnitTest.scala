package cl.uchile.dcc.citric
package model.unities

import scala.util.Random
import model.unities.PlayerCharacter

class AbstractWildUnitTest extends munit.FunSuite {
  /** We know from Liskov Principle that all the properties of WildUnit will be
   * provable for the subclasses of WildUnit, so we just need to test the
   * properties of WildUnit and we will know that it will work in the rest */
  private var TestingUnit: AbstractWildUnit = _

  /** Lets define a character */
  private val nameC = "testPlayer"
  private val maxHp = 10
  private val attack2 = 1
  private val defense2 = 1
  private val evasion2 = 1
  private var objective = "Stars"
  private val randomNumberGenerator = new Random(11)
  private var character: PlayerCharacter = _ // <- x = _ is the same as x = null

  override def beforeEach(context: BeforeEach): Unit = {
    TestingUnit = new Chicken()
    character = new PlayerCharacter(
      nameC,
      maxHp,
      attack2,
      defense2,
      evasion2,
      objective,
      randomNumberGenerator
    )
  }

  test("A Wild Unit should be correctly defined"){
    assertEquals(3, TestingUnit.maxHP)
    assertEquals(3, TestingUnit.HP)
    assertEquals(-1, TestingUnit.attack)
    assertEquals(-1, TestingUnit.defense)
    assertEquals(1, TestingUnit.evasion)
  }
  test("A Wild Unit should check well if is alive"){
    assert(TestingUnit.isAlive())
  }
  test("A Wild Unit should be defeated correctly by a player"){
    assert(TestingUnit.playerDefeat(character))
  }


}
