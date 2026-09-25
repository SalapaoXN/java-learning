# Backend 10 — Architecture and interview review

Describe a system through requirements, components, data flow, failure cases, and trade-offs. For TxFlow: API → application use case → domain rules → PostgreSQL transaction/ledger → optional outbox → Kafka consumers. Begin as a modular monolith (`auth`, `wallet`, `transfer`, `ledger`); split services only when independent scaling, ownership, or reliability justifies distributed-system cost.

Prepare to explain: why transactions; how overdraft is prevented; how retries avoid duplicate transfer; what happens if Kafka is unavailable; how schema migrations roll forward; how tests prove rollback; what sensitive data is protected. Include architecture diagram, setup instructions, API examples, design decisions, and known limitations in README.

**Final check:** explain one failure at every boundary and the evidence that the system recovers safely. If you cannot explain a dependency or annotation, trace its runtime role before adding more technology.
