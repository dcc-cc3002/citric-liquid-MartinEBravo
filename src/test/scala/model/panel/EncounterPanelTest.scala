package cl.uchile.dcc.citric
package model.panel

import cl.uchile.dcc.citric.model.unities.character.PlayerCharacter
import cl.uchile.dcc.citric.model.unities.wildunities.RoboBall

import scala.util.Random

class EncounterPanelTest extends munit.FunSuite {

  private var panel: EncounterPanel = _

  override def beforeEach(context: BeforeEach): Unit = {
    panel = new EncounterPanel(new RoboBall)
  }

  test("A EncounterPanel should be correctly defined") {
    assert(panel.characters.isEmpty)
    assert(panel.nextPanels.isEmpty)
  }

  test("A EncounterPanel should add and remove characters from the buffer correctly")
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

  test("A EncounterPanel should add and remove nextPanels correctly") {
    val nextPanel = new EncounterPanel(new RoboBall)
    panel.addPanels(nextPanel)
    assert(panel.nextPanels.contains(nextPanel))
    panel.removePanels(nextPanel)
    assert(!panel.nextPanels.contains(nextPanel))
  }

  test("A EncounterPanel should start a battle correctly"){
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
    val nameC2 = "testPlayer2"
    val character2 = new PlayerCharacter(
      nameC2,
      maxHp,
      attack,
      defense,
      evasion,
    )
    panel.apply(character)
    assert(character.stars == 0)
    assert(character2.stars == 0)
  }
}
