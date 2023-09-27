package service;

import model.Question;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class JavaQuestionService implements QuestionService {
    //Set<Question> questions;
    private List<Question> questions = new ArrayList<>();
    @Override
    public void addQuestion(String question, String answer) {
        questions.add(new Question(question, answer));
    }

    @Override
    public void addQuestion(Question question) {

    }

    @Override
    public boolean removeQuestion(String question, String answer) {
        for (Question q : questions) {
            if (q.getQuestion().equals(question) && q.getAnswer().equals(answer)) {
                questions.remove(q);
                return true;
            }
        }
        return false;
    }

    @Override
    public Collection<Question> getAll() {
        return questions;
    }

    @Override
    public Question getRandomQuestion() {
        Random random = new Random();
        int randomNumber = random.nextInt(questions.size());
        return questions.get(randomNumber);
    }
}

