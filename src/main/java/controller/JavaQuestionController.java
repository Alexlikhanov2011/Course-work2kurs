package controller;

import model.Question;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import service.QuestionService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/question")
public class JavaQuestionController {
    private final QuestionService service;

    public JavaQuestionController(QuestionService service) {
        this.service = service;
    }

    @GetMapping("/add")
    public void addQuestion(@RequestParam Question question) {
        service.addQuestion(question);
    }
    @GetMapping("/remove")
    public boolean removeQuestion(@RequestParam String question,@RequestParam String answer ) {
       return service.removeQuestion(question,answer );
    }
}
