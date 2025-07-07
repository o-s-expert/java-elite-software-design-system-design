# 🧪 Solution: Credit Card Lifecycle

## 🖼️ State Diagram (Mermaid)

```mermaid
stateDiagram-v2
    [*] --> Created : 🆕 Issue Card
    Created --> Active : 🟢 Activate
    Active --> Suspended : ⏸️ Suspend
    Suspended --> Active : 🔄 Resume
    Active --> Cancelled : ❌ Cancel
    Created --> Cancelled : 🚫 Reject
    Cancelled --> [*]
```

## 📌 Observations

* `Created` is the state right after issuing a card.
* `Active` is the fully operational state.
* `Suspended` is a temporary inactive state.
* `Cancelled` is a terminal state – there's no way back. ☠️
* You can **loop** between `Active` and `Suspended`, which is useful for fraud prevention, travel pauses, etc.

🧠 _This diagram helps developers and stakeholders clearly understand the allowed transitions in a card's lifecycle._

