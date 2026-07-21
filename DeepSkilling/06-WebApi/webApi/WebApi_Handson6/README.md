# WebApi Handson 6 — Apache Kafka Messaging

> **Week 2 · CTS Deep Skilling · ASP.NET Core Web API**

## Overview

Demonstrates **real-time message streaming** using Apache Kafka with the Confluent .NET Kafka client library. Consists of two independent console applications:

- **KafkaProducer** — reads messages from the console and publishes them to a Kafka topic (`chat-topic`)
- **KafkaConsumer** — subscribes to `chat-topic` and prints every received message to the console in real time

### Learning Objectives

- Understand core Kafka concepts: **broker**, **topic**, **partition**, **offset**, **consumer group**
- Configure `ProducerConfig` with `BootstrapServers` and build a producer
- Produce messages asynchronously using `ProduceAsync(topic, message)`
- Configure `ConsumerConfig` with `GroupId` and `AutoOffsetReset`
- Subscribe to a topic and consume messages in a poll loop
- Set `AutoOffsetReset.Earliest` to replay all messages from the beginning

---

## Technologies Used

| Technology | Version | Purpose |
|------------|---------|---------|
| C# / .NET | 10.0 | Language & runtime |
| Confluent.Kafka | 2.8.0 | Kafka producer/consumer .NET client |

---

## Folder Structure

```
WebApi_Handson6/
├── KafkaProducer/
│   ├── KafkaProducer.csproj
│   └── Program.cs              # Console → ProduceAsync("chat-topic", message)
└── KafkaConsumer/
    ├── KafkaConsumer.csproj
    └── Program.cs              # Polls "chat-topic" and prints messages
```

---

## Prerequisites

- [.NET 10 SDK](https://dotnet.microsoft.com/download/dotnet/10.0)
- **Apache Kafka** running on `localhost:9092`

### Start Kafka with Docker (Quickest Option)

```bash
# Start Zookeeper
docker run -d --name zookeeper -p 2181:2181 bitnami/zookeeper:latest

# Start Kafka
docker run -d --name kafka -p 9092:9092 \
  -e KAFKA_CFG_ZOOKEEPER_CONNECT=zookeeper:2181 \
  -e KAFKA_CFG_ADVERTISED_LISTENERS=PLAINTEXT://localhost:9092 \
  bitnami/kafka:latest
```

---

## How to Run

Open **two separate terminals**:

### Terminal 1 — Start the Consumer First

```bash
cd "week 2/webApi/WebApi_Handson6/KafkaConsumer"
dotnet restore
dotnet run
```

Output:
```
Kafka Consumer Started
```

### Terminal 2 — Start the Producer

```bash
cd "week 2/webApi/WebApi_Handson6/KafkaProducer"
dotnet restore
dotnet run
```

Output:
```
Kafka Producer Started
Enter Message : Hello World!
Enter Message : CTS Deep Skilling
Enter Message : exit          ← type 'exit' to quit
```

The Consumer terminal will display each message as it arrives.

---

## Architecture

```
┌─────────────────────┐       ┌──────────────────┐       ┌─────────────────────┐
│    KafkaProducer    │──────▶│   Kafka Broker   │──────▶│    KafkaConsumer    │
│  (Console Input)    │       │  localhost:9092   │       │  (Console Output)   │
│                     │       │   chat-topic      │       │                     │
│  ProduceAsync()     │       │  [partition 0]   │       │  consumer.Consume() │
└─────────────────────┘       └──────────────────┘       └─────────────────────┘
```

---

## Key Configuration

### Producer (`ProducerConfig`)
```csharp
var config = new ProducerConfig { BootstrapServers = "localhost:9092" };
```

### Consumer (`ConsumerConfig`)
```csharp
var config = new ConsumerConfig
{
    BootstrapServers = "localhost:9092",
    GroupId = "chat-group",
    AutoOffsetReset = AutoOffsetReset.Earliest
};
```

---

*Part of CTS Deep Skilling — Week 2 Web API Module*
