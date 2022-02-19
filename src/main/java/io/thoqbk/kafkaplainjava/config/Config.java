package io.thoqbk.kafkaplainjava.config;

public class Config {
  public static final String KAFKA_BROKERS = "localhost:9092";

  public static final String TOPIC_NAME = "topic-demo";

  public static final String GROUP_ID_CONFIG = "consumerGroup1";

  public static final int MAX_NO_MESSAGE_FOUND_COUNT = 100;

  public static final String OFFSET_RESET_LATEST = "latest";

  public static final String OFFSET_RESET_EARLIEST = "earliest";

  public static final int MAX_POLL_RECORDS = 1;

  public static final String PRODUCER_MODE = "p";

  public static final String CONSUMER_MODE = "c";
}
