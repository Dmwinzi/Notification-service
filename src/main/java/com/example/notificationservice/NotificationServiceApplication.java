package com.example.notificationservice;

import com.example.notificationservice.Event.Orderplacedevent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class NotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotificationServiceApplication.class, args);

	}


	@KafkaListener(topics = "Notification")
	public void handlenotification(Orderplacedevent orderplacedevent){
		log.info("Recieved order " + orderplacedevent.getOrdernumber());
	}


}
