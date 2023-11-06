package cl.uchile.dcc.citric
package model.norma
import munit.FunSuite

class Norma5Test extends munit.FunSuite {

  private var norma5: Norma5 = _

  override def beforeEach(context: BeforeEach): Unit = {
    norma5 = new Norma5
  }

  test("Norma5 should initialize correctly") {
    assertEquals(norma5.stars, 120)
    assertEquals(norma5.victories, 10)
    assertEquals(norma5.normaNumber, 5)
  }

  test("Verifying that Norma2's nextNorma is Norma3") {
    val nextNorma: Norma = norma5.nextNorma
    nextNorma match {
      case _: Norma6 => assert(true)
      case _ => fail("Norma2's nextNorma is not Norma3")
    }
  }

}
