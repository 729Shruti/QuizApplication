package shruti.example.QuizApplication.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shruti.example.QuizApplication.entity.QuizQuestion;

@Repository
public interface QuestionRepo extends JpaRepository<QuizQuestion,Long> {

}
