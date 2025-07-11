= Software Design & System Design
:toc: auto

== Introduction

* Software Design vs Software Architecture
* System Design vs Software Design
* Importance of understanding both for software engineers
* Overview of the topics covered in this document

== System Design

=== Basic Principles of System Design

- Tiers vs layers
- System components: front-end, back-end, databases, caches
- Scalability: vertical vs horizontal
- Latency and throughput: how to optimize both

=== Documentations

- How to document a system design
- Use of diagrams (UML, C4 model)
- Importance of clear and concise documentation
- Documentation as code
-- Why documentation as code is important?

=== Databases

- SQL
- NoSQL
- NewSQL
- CAP / PACELC
- ETL (Extract, Transform, Load)
- ELT (Extract, Load, Transform)
- Data warehousing and data lakes
- Designing Scalable Systems
-- Data partitioning (sharding)
-- Load balancers
-- Use of caches (Redis, Memcached) for optimization
-- Distributed databases and replication

=== Communication Between Components

- Synchronous APIs (REST, gRPC)
- Asynchronous communication with queues and message brokers (Kafka, RabbitMQ)
- Robust interface design for integration
- High Availability and Fault Tolerance
-- Resilient projects with Circuit Breakers and retries
-- Replication and failover strategies
-- Tools for monitoring and automatic recovery (auto-healing)

=== Practical Case Studies

- High-scale e-commerce (like Amazon)
- Reservation system (like Uber or Booking)
- Social media feed (like Instagram or Twitter)

=== Recommended Reading

* Xu, A. (2020). _System Design Interview – An Insider’s Guide_. ByteByteGo. https://www.amazon.com.br/dp/B08B3FWYBX/
* Xu, A. (2021). _System Design Interview – An Insider’s Guide, Volume 2_. ByteByteGo. https://www.amazon.com.br/dp/1736049119/

== Software Design

=== Basic Principles of Software Design

- Why?
-- The cost of bad software design
- SOLID principles
    - Single Responsibility Principle (SRP)
    - Open/Closed Principle (OCP)
    - Liskov Substitution Principle (LSP)
    - Interface Segregation Principle (ISP)
    - Dependency Inversion Principle (DIP)
- DRY (Don't Repeat Yourself)
- KISS (Keep It Simple, Stupid)
- YAGNI (You Aren't Gonna Need It)
- Separation of Concerns
- Composition over Inheritance
- Law of Demeter (Principle of Least Knowledge)
- Coupling and Cohesion
- Encapsulation
- Code readability and maintainability
- Testability and TDD (Test-Driven Development)
- Refactoring and code smells


=== Design Patterns

- Why use design patterns?
- Singleton
- Factory
- Strategy
- Observer
- Builder
- Prototype
- Adapter
- Decorator
- Proxy

=== Introduction to Domain-Driven Design (DDD)

==== Strategic DDD

- Bounded Context
- Context Mapping
- Ubiquitous Language
- Patterns of integrations

==== Tactical DDD

- Patterns
- Overview
- Entity
- Aggregator
- Repository
- Coupling/Decoupling
- Refactoring

=== Recommended Reading

* Martin, R. C. (2008). _Clean Code: A Handbook of Agile Software Craftsmanship_. Prentice Hall.
* Ousterhout, J. (2021). _A Philosophy of Software Design_ (2nd ed.). Yaknyam Press.
* Khononov, V. (2021). _Balancing Coupling in Software Design: Universal Design Principles for Architecting Modular Software Systems_. Manning Publications.
* Fowler, M. (2018). _Refactoring: Improving the Design of Existing Code_ (2nd ed.). Addison-Wesley.
* Beck, K. (2023). _Tidy First?: A Personal Exercise in Empirical Software Design_. Oddprint.
