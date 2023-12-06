package cl.uchile.dcc.citric
package controller.states

import controller.GameController

class PlayerTurnStateTest extends munit.FunSuite {

  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new PlayerTurnState(controller))
  }

  test("A PlayerTurnState should check if the player is KO correctly") {
    controller.isKO()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[RecoveryState])
  }

  test("A PlayerTurnState should stop movement correctly") {
    controller.stopMovement()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[CombatState])
  }

  test("A PlayerTurnState should check if the player is out of movement correctly") {
    controller.outOfMovement()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[CombatState])
  }
}
