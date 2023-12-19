package cl.uchile.dcc.citric
package model

class EncounterPanelTest extends munit.FunSuite {
  test("Adding a character to EncounterPanel should increase the characters count") {
    val encounterPanel = new EncounterPanel()
    val character = new PlayerCharacter("Alice")

    encounterPanel.addCharacter(character)

    assertEquals(encounterPanel.characters.size, 1)
    assertEquals(encounterPanel.characters.head, character)
  }

  test("Removing a character from APanel should decrease the characters count") {
    val encounterPanel = new EncounterPanel()
    val character = new PlayerCharacter("Bob")
    encounterPanel.addCharacter(character)

    encounterPanel.removeCharacter(character)

    assertEquals(encounterPanel.characters.size, 0)
  }

  test("Removing a character when no characters exist should do nothing") {
    val encounterPanel = new EncounterPanel()
    val character = new PlayerCharacter("Charlie")

    encounterPanel.removeCharacter(character)

    assertEquals(encounterPanel.characters.size, 0)
  }
}
