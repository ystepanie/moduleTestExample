package com.example.moduletest;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ModuletestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ModuletestApplication.class, args);

		SampleService sampleService = context.getBean(SampleService.class);
		Sample sample = sampleService.findSampleById(1L);
		System.out.println("empty entity :" + sample);
		System.out.println("------------");

		Sample savedSample = sampleService.save(new Sample(null, "name", "description", "test", LocalDateTime.now(), null));
		System.out.println("saved entity :" + sampleService.findSampleById(savedSample.getId()));
	}

}
