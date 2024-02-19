package com.example.QuizService.repositories;

import com.example.QuizService.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz ,Long> {
}
