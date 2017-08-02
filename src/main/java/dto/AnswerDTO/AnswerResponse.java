package dto.AnswerDTO;

import domain.Answer;
import domain.Theme;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class AnswerResponse {

    private Long id;
    private String answerText;
    private Theme theme;

    public AnswerResponse(Answer answer) {
        this.id = answer.getId();
        this.answerText = answer.getAnswerText();
        this.theme = answer.getTheme();
    }

    public AnswerResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }
}
