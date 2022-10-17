# Demo for Kafka introduction
This project is used for the Kafka introduction presentation where the most important fundamentals of Kafka are presented.
Topics that are covered:
* Kafka Cluster
* Brokers
* Topic
* Partitions (leader and ISR)
* Offset
* Topic Replication Factor
* Producers (round-robin, key based ordering, ACKs strategy) 
* Consumers (consumer offset, consumer groups, at least / most once) 
* Zookeeper

## 1. Compile application
`mvn clean compile`

## 2. Run Docker compose
Run `docker-compose up` in the root folder to bring up Docker container of Kafka and Zookeeper.

## 3. Run application
Run [SpringBootWithKafkaDemoApplication](src/main/java/com/demo/kafka/SpringBootWithKafkaDemoApplication.java) (see application.yml for Kafka Producer and consumer configuration). The application is exposed on the default Spring Application 8080 TCP port.

## 4. Tools
* We will use Kafka tool (also named: Offset Explorer) as a free alternative of Kafka UI (https://www.kafkatool.com/)
  * For Windows: download the `.exe`
  * For Linux: download the `.sh` and execute is using the following command: `sh offsetexplorer.sh`

Copyright © 2022, Simon Van den Bossche
