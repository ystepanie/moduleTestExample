package com.example.moduletest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SampleConfig {
  @Bean
  public SampleService sampleService(SampleRepository sampleRepository) {
    return new SampleService(sampleRepository);
  }
}
