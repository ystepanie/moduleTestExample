package com.example.moduletest;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ModuletestApplicationTests {

	@Autowired
	SampleRepository sampleRepository;

	@Autowired
	SampleService sampleService;

	@Test
	void contextLoads() {
	}

	@Test
	void testConfig에서_주입받은_SampleInmemoryRepository가_적용되었는지_테스트한다() {
		assertThat(sampleRepository).isInstanceOf(SampleInmemoryRepository.class);
	}

	@Test
	void sampleService에서_주입받은_SampleInmemoryRepository가_적용되었는지_테스트한다() {
		Sample sample = new Sample(null, "name", "description", "test", LocalDateTime.now(), null);
		Sample savedSample = sampleService.save(sample);
		assertThat(savedSample.getId()).isEqualTo(1L);
	}

}
