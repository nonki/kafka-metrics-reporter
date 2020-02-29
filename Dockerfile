FROM confluentinc/cp-kafka:5.4.0

COPY build/libs/metrics_reporter-*.jar /usr/share/java/kafka/
