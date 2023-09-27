package service;

import model.Question;

import java.util.Collection;

public interface QuestionService {
void addQuestion(String question, String answer);

void addQuestion(Question question);

boolean removeQuestion(String question, String answer);

Collection <Question> getAll();

Question getRandomQuestion();
}
