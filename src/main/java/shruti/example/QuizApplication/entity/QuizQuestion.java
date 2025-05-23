package shruti.example.QuizApplication.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String questionText;
    @ElementCollection
    @CollectionTable(name = "question_options", joinColumns = @JoinColumn(name = "question_id"))
    @Column(name = "option_text")
    private List<String> options;


    private String corretAnswer;


    public List<String> getOptions() {
        return options;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getCorretAnswer() {
        return corretAnswer;
    }

    public void setCorretAnswer(String corretAnswer) {
        this.corretAnswer = corretAnswer;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}

