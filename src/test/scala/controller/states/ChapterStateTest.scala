package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

class ChapterStateTest extends munit.FunSuite {

  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new ChapterState(controller))
  }

  test("A ChapterState should play turn correctly") {
    controller.playTurn()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[PlayerTurnState])
  }

  test("A ChapterState should change to KO"){
    controller.isKO()
    assert(controller.state.isInstanceOf[RecoveryState])
  }

  test("A ChapterState should change to EndState"){
    controller.normaSixReached()
    assert(controller.state.isInstanceOf[EndState])
  }
}
