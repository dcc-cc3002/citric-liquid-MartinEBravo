package cl.uchile.dcc.citric
package model.norma
import munit.FunSuite

class Norma3Test extends munit.FunSuite {

  private var norma3: Norma3 = _

  override def beforeEach(context: BeforeEach): Unit = {
    norma3 = new Norma3
  }

  test("Norma3 should initialize correctly") {
    assertEquals(norma3.stars, 30)
    assertEquals(norma3.victories, 3)
    assertEquals(norma3.normaNumber, 3)
  }

  test("Verifying that Norma2's nextNorma is Norma3") {
    val nextNorma: Norma = norma3.nextNorma
    nextNorma match {
      case _: Norma4 => assert(true)
      case _ => fail("Norma2's nextNorma is not Norma3")
    }
  }

}
