package com.example.QuizService.repositories;

import com.example.QuizService.entities.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends JpaRepository<Quiz ,Long> {
}
