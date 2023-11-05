package cl.uchile.dcc.citric
package model.norma
import munit.FunSuite

class Norma4Test extends munit.FunSuite {

  private var norma4: Norma4 = _

  override def beforeEach(context: BeforeEach): Unit = {
    norma4 = new Norma4
  }

  test("Norma4 should initialize correctly") {
    assertEquals(norma4.stars, 70)
    assertEquals(norma4.victories, 6)
    assertEquals(norma4.normaNumber, 4)
  }

  test("Verifying that Norma2's nextNorma is Norma3") {
    val nextNorma: Norma = norma4.nextNorma
    nextNorma match {
      case _: Norma5 => assert(true)
      case _ => fail("Norma2's nextNorma is not Norma3")
    }
  }

}
