# Backend 8 — Redis and Kafka

Redis is an in-memory data store often used for cache, short-lived coordination, and rate limiting. A cache needs a key, TTL, invalidation/update rule, and a plan for stale data or cache outage. Do not cache authoritative wallet balance without a correctness design.

Kafka is a durable event log with producers, topics, partitions, and consumer groups. Events communicate facts that have happened; consumers must tolerate redelivery. Use an outbox pattern when database commit and event publication must remain consistent. Ordering is generally within a partition, not globally.

**Check:** consumer receives same event twice—make side effects idempotent. Debug: DB row committed but event lost; use transactional outbox and relay.

Next: [delivery and observability]009-delivery.md).
