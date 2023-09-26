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
      randomNumberGenerator
    )
    TestingPanel = new HomePanel(character)
    character2 = new PlayerCharacter(
      nameC2,
      maxHp,
      attack,
      defense,
      evasion,
      randomNumberGenerator
    )
  }

  test("A HomePanel should be activated correctly") {
    assert(TestingPanel.activate(character2))
  }
}
