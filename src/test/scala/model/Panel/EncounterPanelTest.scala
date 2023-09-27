package cl.uchile.dcc.citric
package model.Panel

import scala.util.Random
import model.Unities.PlayerCharacter

class EncounterPanelTest extends munit.FunSuite {
  /** Lets define a BottlePanel */
  private var TestingPanel: EncounterPanel = _

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
    TestingPanel = new EncounterPanel()
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

  test("An Encounter Panel should start a battle correctly") {
    TestingPanel.battle(character)
    assertEquals(9,character.HP)
  }
}
