package com.example.springvaltrainingprova.repository;

import com.example.springvaltrainingprova.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
}
