# Kafka plain java

Using plain java to create a simple producer and consumer

## Get started

1. Compile project by running the following command
```shell
mvn clean install assembly:single
```

the bundle file is `demo.jar` in `target` folder

2. Start kafka server

First, we need to start zookeeper
```shell
bin/zookeeper-server-start.sh config/zookeeper.properties
```

then start kafka server
```shell
bin/kafka-server-start.sh config/server.properties
```

## Demos:
- Demo 1: [multi-consumer instances with 1 topic and multi-partition](docs/demo-1-multi-partition.md)