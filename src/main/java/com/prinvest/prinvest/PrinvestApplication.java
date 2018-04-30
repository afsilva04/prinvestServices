package com.prinvest.prinvest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrinvestApplication {

	/*@Bean
	public ObjectMapper objectMapper() {
		ObjectMapper objectMapper = new ObjectMapper();
		//objectMapper.registerModule(new JavaTimeModule());
		//objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		return objectMapper;
	}*/

	public static void main(String[] args) {
		SpringApplication.run(PrinvestApplication.class, args);
	}
}
