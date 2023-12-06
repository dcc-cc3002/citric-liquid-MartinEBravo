package cl.uchile.dcc.citric
package controller.states

import cl.uchile.dcc.citric.controller.GameController

class LandingPanelStateTest extends munit.FunSuite{

  private var controller: GameController = _

  override def beforeEach(context: BeforeEach): Unit = {
    controller = new GameController
    controller.changeState(new LandingPanelState(controller))
  }

  test("A LandingPanelState should do a effect correctly") {
    controller.doEffect()
    // Lets see if the array of players is not empty
    assert(controller.state.isInstanceOf[ChapterState])
  }




}
