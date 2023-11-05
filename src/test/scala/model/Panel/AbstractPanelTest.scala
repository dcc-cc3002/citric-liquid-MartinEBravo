package cl.uchile.dcc.citric
package model.panel

import scala.util.Random
import model.unities.PlayerCharacter

class AbstractPanelTest extends munit.FunSuite {
  /** We know from Liskov Principle that all the properties of APanel will be
   * provable for the subclasses of APanel, so we just need to test the
   * properties of APanel and we will know that it will work in the rest */
  private var TestingPanel: AbstractPanel = _

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
    TestingPanel = new NeutralPanel()
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

  test("An APanel should be defined correctly") {
    assert(TestingPanel.characters.isEmpty)
    assert(TestingPanel.nextPanels.isEmpty)
  }
  test("An APanel should add characters correctly") {
    TestingPanel.addCharacter(character)
    assert(!TestingPanel.characters.isEmpty)
  }
  test("An APanel should remove characters correctly") {
    TestingPanel.removeCharacter(character)
    assert(TestingPanel.characters.isEmpty)

  }
}
