package cl.uchile.dcc.citric
package model

class NeutralPanelTest extends munit.FunSuite {
  test("Adding a character to NeutralPanel should increase the characters count") {
    val neutralPanel = new NeutralPanel()
    val character = new PlayerCharacter("Alice")

    neutralPanel.addCharacter(character)

    assertEquals(neutralPanel.characters.size, 1)
    assertEquals(neutralPanel.characters.head, character)
  }

  test("Removing a character from APanel should decrease the characters count") {
    val neutralPanel = new NeutralPanel()
    val character = new PlayerCharacter("Bob")
    neutralPanel.addCharacter(character)

    neutralPanel.removeCharacter(character)

    assertEquals(neutralPanel.characters.size, 0)
  }

  test("Removing a character when no characters exist should do nothing") {
    val neutralPanel = new NeutralPanel()
    val character = new PlayerCharacter("Charlie")

    neutralPanel.removeCharacter(character)

    assertEquals(neutralPanel.characters.size, 0)
  }
}
