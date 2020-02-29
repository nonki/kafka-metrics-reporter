package com.github.nonki.kafka.metrics_reporter;

import java.util.List;
import java.util.Map;
import org.apache.kafka.common.metrics.MetricsReporter;
import org.apache.kafka.common.metrics.KafkaMetric;

/**
 * Provides metrics for Kafka
 *
 * <p>
 * Write metrics to a Kafka topic such as topic size, partitions per broker, etc.
 * This can be used by other tools to rebalance partitions etc.
 * </p>
 *
 * @since 0.0.1
 */
public class MetricsApplication implements MetricsReporter {
	/**
	 * Returns a friendly greeting
	 *
	 * @since 0.0.1
	 * @return a friendly greeting message
	 */
	public String getGreeting() {
		return "Hello, World!";
	}

	@Override
	public synchronized void init(List<KafkaMetric> metrics) {
		System.out.println("INIT");
		metrics.stream().map(i -> i.metricName()).forEach(System.out::println);
	}

	@Override
	public synchronized void close() {
		System.out.println("CLOSE");
	}

	@Override
	public void metricRemoval(KafkaMetric metric) {
		System.out.println("METRIC REMOVAL: " + metric.metricName() + " " + metric.metricValue());
	}

	@Override
	public void metricChange(KafkaMetric metric) {
		System.out.println("METRIC CHANGE: " + metric.metricName() + " " + metric.metricValue());
	}

	@Override
	public void configure(Map<String, ?> props) {
		System.out.println("CONFIGURE");
		System.out.println(props.toString());
	}
}
