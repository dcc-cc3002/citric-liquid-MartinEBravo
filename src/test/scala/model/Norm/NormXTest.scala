package cl.uchile.dcc.citric
package model.Norm

import model.Unities.PlayerCharacter
import scala.util.Random

class NormXTest extends munit.FunSuite {

  /** Lets define a norm to test it */
  private val name = 2
  private val stars = 10
  private val victories = 1
  private var norma: NormX = _

  /** Lets define a character */
  private val nameC = "testPlayer"
  private val maxHp = 10
  private val attack = 1
  private val defense = 1
  private val evasion = 1
  private val randomNumberGenerator = new Random(11)
  private var character: PlayerCharacter = _ // <- x = _ is the same as x = null

  // This method is executed before each `test(...)` method.
  override def beforeEach(context: BeforeEach): Unit = {
    norma = new NormX(
      name, stars, victories
    )
    character = new PlayerCharacter(
      nameC,
      maxHp,
      attack,
      defense,
      evasion,
      randomNumberGenerator
    )
  }

  test("A Norm should have correctly set their attributes"){
    assertEquals(norma.name, name)
    assertEquals(norma.stars, stars)
    assertEquals(norma.victories, victories)

  }
  test("A Norm should check correctly that the character has not a new norm yet") {
    assert(!norma.normaCheck(character))
  }

  test("A player should clear its norm correctly"){
      assert(norma.normaClear(character))
  }
}
