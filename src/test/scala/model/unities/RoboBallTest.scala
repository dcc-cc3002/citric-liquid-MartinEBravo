package cl.uchile.dcc.citric
package model.Unities

class RoboBallTest extends munit.FunSuite {

  private var TestingUnit: AWildUnit = _

  override def beforeEach(context: BeforeEach): Unit = {
    TestingUnit = new RoboBall()
  }

    test("A RoboBall should be correctly defined") {
    assertEquals(3, TestingUnit.maxHP)
    assertEquals(3, TestingUnit.HP)
    assertEquals(-1, TestingUnit.attack)
    assertEquals(1, TestingUnit.defense)
    assertEquals(-1, TestingUnit.evasion)
  }
}
