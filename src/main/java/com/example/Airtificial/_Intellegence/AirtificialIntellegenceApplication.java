package com.example.Airtificial._Intellegence;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.Airtificial._Intellegence.mapper")
public class AirtificialIntellegenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirtificialIntellegenceApplication.class, args);
	}

}
