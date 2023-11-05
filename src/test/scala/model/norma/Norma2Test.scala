package cl.uchile.dcc.citric
package model.norma
import munit.FunSuite

class Norma2Test extends munit.FunSuite {

  private var norma2: Norma2 = _

  override def beforeEach(context: BeforeEach): Unit = {
    norma2 = new Norma2
  }

  test("A Norma2 should have correctly set their attributes") {
    assertEquals(norma2.stars, 10)
    assertEquals(norma2.victories, 1)
    assertEquals(norma2.normaNumber, 2)
  }

  test("Verifying that Norma2's nextNorma is Norma3") {
    val nextNorma: Norma = norma2.nextNorma
    nextNorma match {
      case _: Norma3 => assert(true)
      case _ => fail("Norma2's nextNorma is not Norma3")
    }
  }
}
