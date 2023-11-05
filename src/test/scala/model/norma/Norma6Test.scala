package cl.uchile.dcc.citric
package model.norma
import munit.FunSuite

class Norma6Test extends munit.FunSuite {

  private var norma6: Norma6 = _

  override def beforeEach(context: BeforeEach): Unit = {
    norma6 = new Norma6
  }

  test("Norma6 should initialize correctly") {
    assertEquals(norma6.stars, 200)
    assertEquals(norma6.victories, 14)
    assertEquals(norma6.normaNumber, 6)
    assertEquals(norma6.nextNorma, norma6)
  }

  test("Verifying that Norma2's nextNorma is Norma3") {
    val nextNorma: Norma = norma6.nextNorma
    nextNorma match {
      case _: Norma6 => assert(true)
      case _ => fail("Norma2's nextNorma is not Norma3")
    }
  }

}
