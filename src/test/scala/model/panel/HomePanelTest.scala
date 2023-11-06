package cl.uchile.dcc.citric
package model.panel

import scala.util.Random

import cl.uchile.dcc.citric.model.unities.PlayerCharacter

class HomePanelTest extends munit.FunSuite {

  private var panel: HomePanel = _

  override def beforeEach(context: BeforeEach): Unit = {
    val nameD = "testOwner"
    val maxHpD = 10
    val attackD = 1
    val defenseD = 1
    val evasionD = 1
    val owner = new PlayerCharacter(
      nameD,
      maxHpD,
      attackD,
      defenseD,
      evasionD,
    )
    panel = new HomePanel(owner)
  }

  test("A HomePanel should be correctly defined") {
    assert(panel.characters.isEmpty)
    assert(panel.nextPanels.isEmpty)
  }

  test("A HomePanel should add and remove characters from the buffer correctly")
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

  test("A HomePanel should add and remove nextPanels correctly") {
    val nextPanel = new HomePanel(panel.owner)
    panel.addPanels(nextPanel)
    assert(panel.nextPanels.contains(nextPanel))
    panel.removePanels(nextPanel)
    assert(!panel.nextPanels.contains(nextPanel))
  }

  test("A Home Panel should do NormaCheck correctly"){
    panel.apply()
    assert(panel.owner.norma.normaNumber == 3)
    panel.apply()
    assert(panel.owner.norma.normaNumber == 4)
    panel.apply()
    assert(panel.owner.norma.normaNumber == 5)
    panel.apply()
    assert(panel.owner.norma.normaNumber == 6)

  }

}
