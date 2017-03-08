package com.xapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@EnableAutoConfiguration
@SpringBootApplication
@RefreshScope
public class IbanserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbanserviceApplication.class, args);
	}
}
