package com.stackroute.Muzix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MuzixApplicationTrack {

	public static void main(String[] args) {
		SpringApplication.run(MuzixApplicationTrack.class, args);
	}

}

