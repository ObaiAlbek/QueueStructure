# 🧱 QueueStructure

Dieses Repository enthält eine Implementierung verschiedener **Queue-Datenstrukturen (Warteschlangen)** in **Java**.  
Es zeigt, wie Queues mithilfe von Arrays implementiert werden können, inklusive einer **zirkulären Queue**, eigener **Fehlerbehandlung (Exceptions)** und **Testklassen**.

---

## 📁 Projektstruktur

```

QueueStructure/
├── CircularQueue_UsingArray/   # Implementierung einer zirkulären Queue
├── JTest.java                  # Testklasse zum Überprüfen der Queue-Funktionalität
├── Main.java                   # Einstiegspunkt für die Programmausführung
├── MyException.java            # Eigene Exception-Klasse für Queue-Fehler
├── MyQueue.java                # Implementierung einer klassischen Queue
└── README.md                   # Diese Datei

````

---

## 🧠 Lernziele

- Verständnis der **Queue-Datenstruktur** (FIFO – First In, First Out)  
- Implementierung einer **zirkulären Queue** mithilfe von Arrays  
- Umgang mit **benutzerdefinierten Exceptions**  
- **Testen und Validieren** der Queue-Operationen (Enqueue, Dequeue, Peek)  
- Verständnis von **Grenzfällen** (z. B. Überlauf, Unterlauf)  

---

## ⚙️ Implementierte Klassen

### 🔹 `MyQueue.java`
Implementiert eine einfache Queue mit grundlegenden Operationen:
- `enqueue()` – Fügt ein Element hinzu  
- `dequeue()` – Entfernt das erste Element  
- `peek()` – Gibt das erste Element zurück, ohne es zu entfernen  
- `isEmpty()` / `isFull()` – Prüfen auf Zustand  

### 🔹 `CircularQueue_UsingArray`
Implementiert eine **zirkuläre Queue**, die Speicher effizienter nutzt, indem sie das Array "wiederverwendet".

### 🔹 `MyException.java`
Definiert benutzerdefinierte Exceptions, um Fehlerfälle (z. B. leere oder volle Queue) zu behandeln.

### 🔹 `JTest.java`
Enthält einfache Testmethoden, um die Funktionsweise der Queue-Klassen zu überprüfen.

### 🔹 `Main.java`
Startklasse, die Beispiele zur Queue-Verwendung demonstriert.

---

## ▶️ Ausführung

Kompiliere und starte die Anwendung mit:

```bash
javac Main.java
java Main
````

Oder führe sie direkt in einer IDE wie **IntelliJ IDEA**, **Eclipse** oder **VS Code** aus.

---

## 💡 Beispielausgabe

```text
Element hinzugefügt: 10
Element hinzugefügt: 20
Aktuelles Element: 10
Element entfernt: 10
Queue-Inhalt: [20]
```

## 🧑‍💻 Autor

**Obai Albek**
Student der Informatik – TH Mannheim
GitHub: [ObaiAlbek](https://github.com/ObaiAlbek)

---

