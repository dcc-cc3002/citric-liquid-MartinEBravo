package cl.uchile.dcc.citric
package controller.states

import controller.GameController

class MovingStateTest extends munit.FunSuite{

  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new MovingState(controller))
  }

  test("A MovingState should choose a path correctly") {
    controller.choosePath()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[MovingState])
  }





}
