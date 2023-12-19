# Tarea 1 | Entrega Parcial 1

Lea las secciones 2.1 a 2.3 del enunciado e identifique qué elementos debieran
ser traits y cuáles clases.
Escriba además los métodos y variables que considere necesarios, junto con sus
tipos.
Anote los métodos con `def` y las variables con `var` o `val` según corresponda.

Indique de qué trait extiende cada clase.

## 1. Traits

Escriba los traits que considere necesarios para modelar el problema.

### Unidad

- val HitPoints_max: Int
- var HitPoints: Int
- val ATK: Int
- val DEF: Int
- val EVA: Int
- def isAlive(HP: Int): Boolean

#### Personaje extends Unidad

- val HitPoints_max: Int
- var HitPoints: Int
- val ATK: Int
- val DEF: Int
- val EVA: Int
- def isAlive(HP: Int): Boolean
- val stars: Int
- def beginTourn(Chapters: Int): Unit
- val victories: Int
- def battle(Enemy: Unidad): Unit
- def recovery(): Unit
- val recoveryAmount: Int
- def endTourn(): Unit # Se va disminuyendo la recoveryAmount

#### Wild Unit extends Unidad

- val HitPoints_max: Int
- var HitPoints: Int
- val ATK: Int
- val DEF: Int
- val EVA: Int
- def isAlive(HP: Int): Boolean
- def playerDefeat(player: Personaje): Unit

### Norma
- val stars: Int
- val victories: int
- def normaCheck(): Unit
- def normaClear(): Unit

### Paneles
- val panelName: String
- val panelType: String 
- var players: int
- val nextPanel: Panel
- def neutralPanel(): Unit
- def homePanel(): Unit
- def bonusPanel(): Unit
- def dropPanel(): Unit
- def encounterPanel(): Unit

## 2. Clases

Escriba las clases que considere necesarias para modelar el problema.

### Player extends Personaje
- val HitPoints_max: Int
- var HitPoints: Int
- val ATK: Int
- val DEF: Int
- val EVA: Int
- def isAlive(HP: Int): Boolean
- val stars: Int
- def beginTourn(Chapters: Int): Unit
- val victories: Int
- def battle(Enemy: Unidad): Unit
- def recovery(): Unit
- val recoveryAmount: Int
- def endTourn(): Unit # Se va disminuyendo la recoveryAmount
- val playerNumber: Int

### Chiken extends Wild Unit
- val HitPoints_max: Int
- var HitPoints: Int
- val ATK: Int
- val DEF: Int
- val EVA: Int
- def isAlive(HP: Int): Boolean
- def playerDefeat(player: Personaje): Unit

### Robo ball extends Wild Unit
- val HitPoints_max: Int
- var HitPoints: Int
- val ATK: Int
- val DEF: Int
- val EVA: Int
- def isAlive(HP: Int): Boolean
- def playerDefeat(player: Personaje): Unit

### Seagull extends Wild Unit
- val HitPoints_max: Int
- var HitPoints: Int
- val ATK: Int
- val DEF: Int
- val EVA: Int
- def isAlive(HP: Int): Boolean
- def playerDefeat(player: Personaje): Unit

### NormaX extends Norma
- val stars: Int
- val victories: int
- def normaCheck(): Unit
- def normaClear(): Unit

### Tablero extends Paneles
- val panelName: String
- val panelType: String 
- var players: int
- val nextPanel: Panel
- def neutralPanel(): Unit
- def homePanel(): Unit
- def bonusPanel(): Unit
- def dropPanel(): Unit
- def encounterPanel(): Unit
- val tablero: Array[Panel]

## Entrega

Entregue por u-cursos un archivo `.md` siguiendo el formato de este archivo.
Puede usar este archivo como base para su entrega.

## Consejo

Puede serle de utilidad dibujar un diagrama con sus clases y traits, y cómo se
relacionan entre sí.
