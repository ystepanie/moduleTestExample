package com.example.moduletest;

import java.util.Optional;

public interface SampleRepository {
  Optional<Sample> findById(Long id);

  Sample save(Sample sample);

  void deleteAll();
}
