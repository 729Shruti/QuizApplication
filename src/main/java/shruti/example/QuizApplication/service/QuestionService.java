package shruti.example.QuizApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shruti.example.QuizApplication.entity.QuizQuestion;
import shruti.example.QuizApplication.repo.QuestionRepo;

import java.util.List;

@Service
public class QuestionService {
    @Autowired
    QuestionRepo questionRepo;

    public List<QuizQuestion> getAllQuestions(){
        List<QuizQuestion>questionRepoAll =questionRepo.findAll();
        return questionRepoAll;
    }

    public QuizQuestion saveQuestion(QuizQuestion quizQuestion){
        QuizQuestion save=questionRepo.save(quizQuestion);
                return save;
    }

}
