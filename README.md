# Demo Micronaut

This is just a demo / playground to familiarize myself with [Micronaut](https://micronaut.io/) with Kotlin.

The project consists of two dummy services:

- a `order` service that exposes a REST API with 1 Endpoint to create an order
- a `calculator` service that exposes a REST API with 1 Endpoint to calculate the price of the order

The order model is imagined to be a simple bike with just a name, price (net) and wished leasing time in months.
The calculator then takes the price and calculates the gross leasing rate per month given some hard coded leasing factors.

## The funny part

- Language: Kotlin 1.8
- Framework: Micronaut 3.9.1
- Service discovery with Consul
- Tracing with Jaeger

## How to run

### Prerequisites

- Docker
- Java jdk 17

1. Start the Consul and Jaeger containers with

~~~bash
./setup.sh
~~~

2. Start the services:
  - in your IDE using the start configuration
  - using gradle with `./gradlew run`
  - compiling and running the jar with `./gradlew build && java -jar build/libs/<service-name>-all.jar`


## Have fun!
