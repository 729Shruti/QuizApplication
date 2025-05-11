package shruti.example.QuizApplication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shruti.example.QuizApplication.entity.QuizQuestion;
import shruti.example.QuizApplication.service.QuestionService;

import java.util.List;

@CrossOrigin(origins = "http://127.0.0.1:5500")
@RestController
@RequestMapping("/api")

public class LoginController {

    @Autowired
    QuestionService questionService;
    @GetMapping("/questions")
    public List<QuizQuestion> getQuestions() {
        return questionService.getAllQuestions();
    }

    @PostMapping(value = "/save", consumes = "application/json", produces = "application/json")
    public QuizQuestion saveQuestion(@RequestBody QuizQuestion question) {
        return questionService.saveQuestion(question);
    }



}
