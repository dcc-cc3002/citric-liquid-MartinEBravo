package cl.uchile.dcc.citric
package model.Unities

import scala.util.Random
import model.Norm.NormX

class PlayerCharacterTest extends munit.FunSuite {
  /*
  REMEMBER: It is a good practice to use constants for the values that are used in multiple
  tests, so you can change them in a single place.
  This will make your tests more readable, easier to maintain, and less error-prone.
  */
  private val name = "testPlayer"
  private val maxHp = 10
  private val attack = 1
  private val defense = 1
  private val evasion = 1
  private var objective = "Stars"
  private val randomNumberGenerator = new Random(11)
  /* Add any other constants you need here... */

  /*
  This is the object under test.
  We initialize it in the beforeEach method so we can reuse it in all the tests.
  This is a good practice because it will reset the object before each test, so you don't have
  to worry about the state of the object between tests.
  */
  private var character: PlayerCharacter = _  // <- x = _ is the same as x = null
  /* Add any other variables you need here... */
  /** Lets define a second character */
  private var enemy: WildUnit = _ // <- x = _ is the same as x = null

  /** Lets define a second character */
  private val nameC2 = "testPlayer2"
  private var character2: PlayerCharacter = _ // <- x = _ is the same as x = null


  // This method is executed before each `test(...)` method.
  override def beforeEach(context: BeforeEach): Unit = {
    character = new PlayerCharacter(
      name,
      maxHp,
      attack,
      defense,
      evasion,
      objective,
      new Random(11)
    )
    enemy = new Chicken()
    character2 = new PlayerCharacter(
      nameC2,
      maxHp,
      attack,
      defense,
      evasion,
      objective,
      randomNumberGenerator
    )
  }

  test("A character should have correctly set their attributes") {
    assertEquals(character.name, name)
    assertEquals(character.maxHP, maxHp)
    assertEquals(character.attack, attack)
    assertEquals(character.defense, defense)
    assertEquals(character.evasion, evasion)
    assertEquals(character.stars, 0)
    assertEquals(character.victories,0)
    assertEquals(character.objective, "Stars")
    assertEquals(character.recoveryAmount, 6)
    assert(character.Norma.isInstanceOf[NormX])
  }

  test("A character should correct check if is alive"){
    assert(character.isAlive())
  }

  // Two ways to test randomness (you can use any of them):

  // 1. Test invariant properties, e.g. the result is always between 1 and 6.
  test("A character should be able to roll a dice") {
    for (_ <- 1 to 10) {
      assert(character.rollDice >= 1 && character.rollDice <= 6)
    }
  }

  // 2. Set a seed and test the result is always the same.
  // A seed sets a fixed succession of random numbers, so you can know that the next numbers
  // are always the same for the same seed.
  test("A character should be able to roll a dice with a fixed seed") {
    val other = new PlayerCharacter(name, maxHp, attack, defense, evasion, objective, randomNumberGenerator)
    for (_ <- 1 to 10) {
      assertEquals(character.rollDice(), other.rollDice())
    }
  }


  test("A character should be able to begin its tourn"){
    assert(character.beginTourn(2))
    assert(character.beginTourn(5))
    assert(!character.beginTourn(-1))
  }

  test("A character should be able to begin a battle"){
    assert(character.battle(enemy))
    assert(character.battle(character2))
  }
  test("A character should be able to enter in recovery phase"){
    assert(character.recovery())
  }
  test("A character should be affected by the end of a chapter"){
    assert(character.endChapter())
  }
  test("A character should change its objective correctly"){
    character.changeObjective(1)
    assertEquals("Victories",character.objective)
    character.changeObjective(1)
    assertEquals("Stars", character.objective)
  }
}
