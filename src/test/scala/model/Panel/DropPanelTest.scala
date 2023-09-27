package cl.uchile.dcc.citric
package model.Panel

import scala.util.Random
import model.Unities.PlayerCharacter

class DropPanelTest extends munit.FunSuite {
  /** Lets define a DropPanel */
  private var TestingPanel: DropPanel = _

  /** Lets define a character */
  private val nameC = "testPlayer"
  private val maxHp = 10
  private val attack = 1
  private val defense = 1
  private val evasion = 1
  private var objective = "Stars"
  private val randomNumberGenerator = new Random(11)
  private var character: PlayerCharacter = _ // <- x = _ is the same as x = null

  override def beforeEach(context: BeforeEach): Unit = {
    TestingPanel = new DropPanel()
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

  test("A DropPanel should take bonus correctly") {
    TestingPanel.bonus(character)
    assertEquals(1,character.stars)
  }
}
