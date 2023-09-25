package com.example.springvaltrainingprova.repository;

import com.example.springvaltrainingprova.model.Salt;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaltRepository extends JpaRepository<Salt, Long> {
}
