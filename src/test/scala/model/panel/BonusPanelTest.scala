package cl.uchile.dcc.citric
package model.panel
import cl.uchile.dcc.citric.model.panel.BonusPanel
import cl.uchile.dcc.citric.model.unities.PlayerCharacter

import scala.util.Random

class BonusPanelTest extends munit.FunSuite {

  private var panel: BonusPanel = _

  override def beforeEach(context: BeforeEach): Unit = {
    panel = new BonusPanel
  }

  test("A BonusPanel should be correctly defined") {
    assert(panel.characters.isEmpty)
    assert(panel.nextPanels.isEmpty)
  }

  test("A BonusPanel should add and remove characters from the buffer correctly")
  {
    val nameC = "testPlayer"
    val maxHp = 10
    val attack = 1
    val defense = 1
    val evasion = 1
    val character = new PlayerCharacter(
      nameC,
      maxHp,
      attack,
      defense,
      evasion,
    )
    panel.addCharacter(character)
    assert(panel.characters.contains(character))
    panel.removeCharacter(character)
    assert(!panel.characters.contains(character))
  }

  test("A BonusPanel should add and remove nextPanels correctly") {
    val nextPanel = new BonusPanel
    panel.addPanels(nextPanel)
    assert(panel.nextPanels.contains(nextPanel))
    panel.removePanels(nextPanel)
    assert(!panel.nextPanels.contains(nextPanel))
  }

  test("A BonusPanel should give bonus correctly")
  {
    val nameC = "testPlayer"
    val maxHp = 10
    val attack = 1
    val defense = 1
    val evasion = 1
    val character = new PlayerCharacter(
      nameC,
      maxHp,
      attack,
      defense,
      evasion,
    )
    panel.addCharacter(character)
    panel.apply(character)
    assert(character.stars > 0)
  }
}
