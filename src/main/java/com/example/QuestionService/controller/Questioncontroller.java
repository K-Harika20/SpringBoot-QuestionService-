package com.example.QuestionService.controller;
import com.example.QuestionService.model.Question;
import com.example.QuestionService.service.Questionservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/questions")
public class Questioncontroller {
    @Autowired
    private Questionservice qservice;

    @PostMapping
    public Question addQuestion(@RequestBody Question question) {
        return qservice.addQuestion(question);
    }

}