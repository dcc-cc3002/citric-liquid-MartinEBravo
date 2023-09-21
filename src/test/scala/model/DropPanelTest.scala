package cl.uchile.dcc.citric
package model


class DropPanelTest extends munit.FunSuite {
  test("Adding a character to DropPanel should increase the characters count") {
    val dropPanel = new DropPanel()
    val character = new PlayerCharacter("Alice")

    dropPanel.addCharacter(character)

    assertEquals(dropPanel.characters.size, 1)
    assertEquals(dropPanel.characters.head, character)
  }

  test("Removing a character from APanel should decrease the characters count") {
    val dropPanel = new DropPanel()
    val character = new PlayerCharacter("Bob")
    dropPanel.addCharacter(character)

    dropPanel.removeCharacter(character)

    assertEquals(dropPanel.characters.size, 0)
  }

  test("Removing a character when no characters exist should do nothing") {
    val dropPanel = new DropPanel()
    val character = new PlayerCharacter("Charlie")

    dropPanel.removeCharacter(character)

    assertEquals(dropPanel.characters.size, 0)
  }
}

}
