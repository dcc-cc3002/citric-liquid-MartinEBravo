package cl.uchile.dcc.citric
package model

class APanelTest extends munit.FunSuite {
  test("Adding a character to APanel should increase the characters count") {
    val aPanel = new APanel()
    val character = new PlayerCharacter("Alice")

    aPanel.addCharacter(character)

    assertEquals(aPanel.characters.size, 1)
    assertEquals(aPanel.characters.head, character)
  }

  test("Removing a character from APanel should decrease the characters count") {
    val aPanel = new APanel()
    val character = new PlayerCharacter("Bob")
    aPanel.addCharacter(character)

    aPanel.removeCharacter(character)

    assertEquals(aPanel.characters.size, 0)
  }

  test("Removing a character when no characters exist should do nothing") {
    val aPanel = new APanel()
    val character = new PlayerCharacter("Charlie")

    aPanel.removeCharacter(character)

    assertEquals(aPanel.characters.size, 0)
  }
}
