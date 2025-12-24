package com.example.moduletest;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SampleJpaRepository extends JpaRepository<Sample, Long>, SampleRepository {

}
