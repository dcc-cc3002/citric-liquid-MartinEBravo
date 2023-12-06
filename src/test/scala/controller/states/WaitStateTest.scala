package cl.uchile.dcc.citric
package controller.states

import controller.GameController

class WaitStateTest extends munit.FunSuite{
  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new WaitState(controller))
  }

  test("A WaitState should evade correctly") {
    controller.evade()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[CombatState])
  }

  test("A WaitState should defend correctly") {
    controller.defend()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[CombatState])
  }

}
