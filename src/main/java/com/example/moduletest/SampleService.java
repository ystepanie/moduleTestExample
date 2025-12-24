package com.example.moduletest;

public class SampleService {
  private final SampleRepository sampleRepository;

  public SampleService(SampleRepository sampleRepository) {
    this.sampleRepository = sampleRepository;
  }

  public Sample findSampleById(Long id) {
    return sampleRepository.findById(id).orElse(null);
  }

  public Sample save(Sample sample) {
    return sampleRepository.save(sample);
  }
}
