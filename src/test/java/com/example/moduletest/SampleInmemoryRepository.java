package com.example.moduletest;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class SampleInmemoryRepository implements SampleRepository {
  private final Map<Long, Sample> store = new HashMap<>();
  private final AtomicLong sequence = new AtomicLong(1);

  @Override
  public Optional<Sample> findById(Long id) {
    return Optional.ofNullable(store.get(id));
  }

  @Override
  public Sample save(Sample sample) {
    if (sample.getId() == null) {
      sample.setId(sequence.getAndIncrement());
    }
    store.put(sample.getId(), sample);
    return sample;
  }

  @Override
  public void deleteAll() {
    store.clear();
  }
}
