package com.example.moduletest;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class testConfig {
  @Bean
  @Primary
  public SampleService sampleService() {
    return new SampleService(sampleRepository());
  }

  @Bean
  @Primary
  public SampleRepository sampleRepository() {
    return new SampleInmemoryRepository();
  }
}
