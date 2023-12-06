package cl.uchile.dcc.citric
package controller.states

import controller.GameController

class RecoveryStateTest extends munit.FunSuite{

  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new RecoveryState(controller))
  }

  test("A RecoveryState should check if the roll is sufficient correctly") {
    controller.suficientRoll()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[PlayerTurnState])
  }

  test("A RecoveryState should check if the roll is insufficient correctly") {
    controller.insuficientRoll()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[ChapterState])
  }
}
