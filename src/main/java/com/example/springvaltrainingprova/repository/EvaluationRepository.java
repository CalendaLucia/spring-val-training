package com.example.springvaltrainingprova.repository;

import com.example.springvaltrainingprova.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvaluationRepository extends JpaRepository<Evaluation,Long> {
}
