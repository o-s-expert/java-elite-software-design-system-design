= Solution: Java Server Request Flow - Sequence Diagram
:toc: left
:icons: font
:source-highlighter: highlightjs
:sectnums:
:kroki-server-url: https://kroki.io
:diagram-server: kroki

== 🧵 Sequence Diagram

This diagram shows how a `GET /books` request flows through a typical layered Java server using Spring.

[source,mermaid]
....
sequenceDiagram
    participant 🌐 Client
    participant 🚪 Controller
    participant ⚙️ Service
    participant 🗄️ Repository
    participant 💾 Database

    🌐 Client->>🚪 Controller: GET /books
    🚪 Controller->>⚙️ Service: fetchBooks()
    ⚙️ Service->>🗄️ Repository: findAll()
    🗄️ Repository->>💾 Database: SELECT * FROM books
    💾 Database-->>🗄️ Repository: ResultSet
    🗄️ Repository-->>⚙️ Service: List<Book>
    ⚙️ Service-->>🚪 Controller: List<Book>
    🚪 Controller-->>🌐 Client: JSON Response
....


