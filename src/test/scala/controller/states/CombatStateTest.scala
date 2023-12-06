package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

class CombatStateTest extends munit.FunSuite {

  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new CombatState(controller))
  }

  test("A CombatState should attack correctly") {
    controller.attack()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[WaitState])
  }

  test("A CombatState should endCombat correctly") {
    controller.endCombat()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[LandingPanelState])
  }
}
