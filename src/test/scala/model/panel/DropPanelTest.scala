package cl.uchile.dcc.citric
package model.panel

import cl.uchile.dcc.citric.model.unities.PlayerCharacter

import scala.util.Random

class DropPanelTest extends munit.FunSuite {

  private var panel: DropPanel = _

  override def beforeEach(context: BeforeEach): Unit = {
    panel = new DropPanel
  }

  test("A DropPanel should be correctly defined") {
    assert(panel.characters.isEmpty)
    assert(panel.nextPanels.isEmpty)
  }

  test("A DropPanel should add and remove characters from the buffer correctly")
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

  test("A DropPanel should add and remove nextPanels correctly") {
    val nextPanel = new DropPanel
    panel.addPanels(nextPanel)
    assert(panel.nextPanels.contains(nextPanel))
    panel.removePanels(nextPanel)
    assert(!panel.nextPanels.contains(nextPanel))
  }

  test("A DropPanel should takes stars from the player correctly"){
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
    val stars = character.stars
    panel.addCharacter(character)
    panel.apply(character)
    assert(character.stars < stars)
  }
}
