# ✅ Solution: C1 – Bank System Context Diagram

```mermaid
%%{init: {'theme': 'default'}}%%
C4Context
    title 🏦 Bank System Context

    Person(customer, "🧑‍💻 Customer", "Bank client using web or mobile apps")
    System(system, "💻 Bank System", "Handles banking operations like transfers and balances")
    System_Ext(processor, "💳 Payment Processor", "External system for handling card payments")

    Rel(customer, system, "Uses", "HTTPS")
    Rel(system, processor, "Processes payments", "HTTPS")
