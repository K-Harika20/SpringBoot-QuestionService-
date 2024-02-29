package com.example.QuestionService.repository;

import com.example.QuestionService.model.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface answerrepo extends JpaRepository<Answer,Integer> {
}
