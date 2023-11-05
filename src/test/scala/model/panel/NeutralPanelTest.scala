package cl.uchile.dcc.citric
package model.panel

import model.unities.PlayerCharacter

class NeutralPanelTest extends munit.FunSuite {

  private var panel: NeutralPanel = _

  override def beforeEach(context: BeforeEach): Unit = {
    panel = new NeutralPanel
  }

  test("A NeutralPanel should be correctly defined") {
    assert(panel.characters.isEmpty)
    assert(panel.nextPanels.isEmpty)
  }

  test("A NeutralPanel should add and remove characters from the buffer correctly")
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

  test("A NeutralPanel should add and remove nextPanels correctly") {
    val nextPanel = new NeutralPanel
    panel.addPanels(nextPanel)
    assert(panel.nextPanels.contains(nextPanel))
    panel.removePanels(nextPanel)
    assert(!panel.nextPanels.contains(nextPanel))
  }

  test("A NeutralPanel should do nothing when a player lands on it") {
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
    panel.apply(character)
  }
}
