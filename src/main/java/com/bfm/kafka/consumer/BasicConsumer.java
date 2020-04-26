package com.bfm.kafka.consumer;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.KafkaConsumer;

/**
 * @author rohsi
 *
 */
public class BasicConsumer<K extends Serializable, V extends Serializable> {

	KafkaConsumer<K, V> consumer;
	
	public BasicConsumer(Properties props) {
		this.consumer = new KafkaConsumer<K, V>(props);
	}
	
	public void subscribe(String topic) {
		consumer.subscribe(Collections.singletonList(topic));
	}
	
	public void subscribe(Collection<String> topics) {
		consumer.subscribe(topics);
	}
}
