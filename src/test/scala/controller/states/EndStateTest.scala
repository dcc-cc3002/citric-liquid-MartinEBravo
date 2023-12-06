package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

class EndStateTest extends munit.FunSuite {

  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new EndState(controller))
  }

  test("A EndState should end the game correctly") {
    // Lets see if the array of players is empty
    assert(controller.playersArray.isEmpty)
  }

}
