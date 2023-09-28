package service;

import exception.NotEnoughQuestionsException;
import model.Question;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExaminerServiceImpl implements ExaminerService {
    private final QuestionService questionService;

    public ExaminerServiceImpl(QuestionService questionService) {
        this.questionService = questionService;
    }

    @Override
    public Collection<Question> getQuestions(int amount) {
        if (amount > questionService.getAll().size()) {
            throw new NotEnoughQuestionsException();
        }
        return Stream.generate(questionService::getRandomQuestion)
                .distinct()
                .limit(amount)
                .collect(Collectors.toList());
    }
}
