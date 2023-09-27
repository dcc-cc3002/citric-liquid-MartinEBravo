package cl.uchile.dcc.citric
package model.Panel

import scala.util.Random
import model.Unities.PlayerCharacter

class HomePanelTest extends munit.FunSuite {
  /** Lets define a BottlePanel */
  private var TestingPanel: HomePanel = _

  /** Lets define a character */
  private val nameC = "testPlayer"
  private val maxHp = 10
  private val attack = 1
  private val defense = 1
  private val evasion = 1
  private var objective = "Stars"
  private val randomNumberGenerator = new Random(11)
  private var character: PlayerCharacter = _ // <- x = _ is the same as x = null

  /** Lets define a second character */
  private val nameC2 = "testPlayer2"
  private var character2: PlayerCharacter = _ // <- x = _ is the same as x = null

  override def beforeEach(context: BeforeEach): Unit = {
    character = new PlayerCharacter(
      nameC,
      maxHp,
      attack,
      defense,
      evasion,
      objective,
      randomNumberGenerator
    )
    TestingPanel = new HomePanel(character)
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

  test("A HomePanel should be activated correctly") {
    TestingPanel.activate(character2)
    assertEquals(character2.HP, maxHp+1)
  }
}
