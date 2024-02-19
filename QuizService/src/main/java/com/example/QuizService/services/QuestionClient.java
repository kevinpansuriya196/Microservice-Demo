package com.example.QuizService.services;

import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.cloud.openfeign.FeignClient;

import java.util.List;
//@FeignClient(url = "http://localhost:8082",value = "Question-Client")
@FeignClient(name = "QUESTION-SERVICE")
public interface QuestionClient {
    @GetMapping("/question/quiz/{quizId}")
    List<TypePatternQuestions.Question> getQuestionOfQuiz(@PathVariable Long quizId);
}

