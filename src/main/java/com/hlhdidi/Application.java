package com.hlhdidi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * application启动类
 * @author hulonghai
 *
 */
@EnableAutoConfiguration
@ComponentScan("com.hlhdidi")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}
