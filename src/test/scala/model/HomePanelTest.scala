package cl.uchile.dcc.citric
package model

class HomePanelTest extends munit.FunSuite {
  test("Adding a character to HomePanel should increase the characters count") {
    val homePanel = new HomePanel()
    val character = new PlayerCharacter("Alice")

    homePanel.addCharacter(character)

    assertEquals(homePanel.characters.size, 1)
    assertEquals(homePanel.characters.head, character)
  }

  test("Removing a character from APanel should decrease the characters count") {
    val homePanel = new HomePanel()
    val character = new PlayerCharacter("Bob")
    homePanel.addCharacter(character)

    homePanel.removeCharacter(character)

    assertEquals(homePanel.characters.size, 0)
  }

  test("Removing a character when no characters exist should do nothing") {
    val homePanel = new HomePanel()
    val character = new PlayerCharacter("Charlie")

    homePanel.removeCharacter(character)

    assertEquals(homePanel.characters.size, 0)
  }
}
