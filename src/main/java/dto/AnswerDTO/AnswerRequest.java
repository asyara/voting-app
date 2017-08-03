package dto.AnswerDTO;

import domain.Theme;
import domain.Vote;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class AnswerRequest extends Vote {

    private String answerText;
    private Theme theme;

    public AnswerRequest(Vote editedVote) {

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
