package cl.uchile.dcc.citric
package model.Unities

import scala.util.Random
import model.Unities.PlayerCharacter

class ChickenTest extends munit.FunSuite {
  /** We know from Liskov Principle that all the properties of WildUnit will be
   * provable for the subclasses of WildUnit, so we just need to test the
   * properties of WildUnit and we will know that it will work in the rest */
  private var TestingUnit: AWildUnit = _

  override def beforeEach(context: BeforeEach): Unit = {
    TestingUnit = new Chicken()
  }

  test("A Chicken should be correctly defined") {
    assertEquals(3, TestingUnit.maxHP)
    assertEquals(3, TestingUnit.HP)
    assertEquals(-1, TestingUnit.attack)
    assertEquals(-1, TestingUnit.defense)
    assertEquals(1, TestingUnit.evasion)
  }
}
