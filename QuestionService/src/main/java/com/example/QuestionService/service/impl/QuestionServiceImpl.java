package com.example.QuestionService.service.impl;

import com.example.QuestionService.entities.Question;
import com.example.QuestionService.repositories.QuestionRepository;
import com.example.QuestionService.service.QuestionService;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.security.PrivateKey;
import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {


    private QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public Question create(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public List<Question> get() {
        return questionRepository.findAll();
    }

    @Override
    public Question getOne(Long id) {
        return questionRepository.findById(id).orElseThrow(()-> new RuntimeException("Question noe found"));
    }



    @Override
    public List<Question> getQuestionsOfQuiz(Long quizId) {
        return questionRepository.findByQuizId(quizId);
    }
}
