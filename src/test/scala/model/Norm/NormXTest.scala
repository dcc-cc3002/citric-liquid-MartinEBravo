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
  private var objective = "Stars"
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
      objective,
      randomNumberGenerator
    )
  }

  test("A Norm should have correctly set their attributes"){
    assertEquals(norma.name, name)
    assertEquals(norma.stars, stars)
    assertEquals(norma.victories, victories)
  }
  test("A Norm should have setters"){
    norma.name_("Hola")
    norma.stars_(31)

  }

  test("A Norm should check correctly itself") {
    assert(!norma.normaCheck(character))

  }

  test("A player should clear its norm correctly"){
      norma.normaClear(character)
      assertEquals(3, norma.name)
      assertEquals(30, norma.stars)
      assertEquals(3, norma.victories)
      norma.normaClear(character)
      assertEquals(4, norma.name)
      assertEquals(70, norma.stars)
      assertEquals(6, norma.victories)
      norma.normaClear(character)
      assertEquals(5, norma.name)
      assertEquals(120, norma.stars)
      assertEquals(10, norma.victories)
      norma.normaClear(character)
      assertEquals(6, norma.name)
      assertEquals(200, norma.stars)
      assertEquals(14, norma.victories)

  }
}
