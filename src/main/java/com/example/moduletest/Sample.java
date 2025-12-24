package com.example.moduletest;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Sample {
  public Sample() {
  }

  public Sample(Long id, String name, String description, String status, LocalDateTime createdAt,
      LocalDateTime updatedAt) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.status = status;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String description;
  private String status;
  private LocalDateTime createdAt;
  private LocalDateTime updatedAt;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public String getStatus() {
    return status;
  }

  public LocalDateTime getCreatedAt() {
    return createdAt;
  }

  public LocalDateTime getUpdatedAt() {
    return updatedAt;
  }

  @Override
  public String toString() {
    return "Sample [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
        + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
  }
}
