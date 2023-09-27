package cl.uchile.dcc.citric
package model.Panel

import scala.util.Random
import model.Unities.PlayerCharacter

class BonusPanelTest extends munit.FunSuite {

  /** Lets define a BonusPanel */
  private var TestingPanel: BonusPanel = _

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
    TestingPanel = new BonusPanel()
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
  /** We will check if the value of the stars changed correctly*/
  test("A BonusPanel should give bonus correctly"){
    TestingPanel.bonus(character)
    assertEquals(1,character.stars)

  }
}
