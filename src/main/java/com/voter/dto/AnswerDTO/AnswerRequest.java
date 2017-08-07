package com.voter.dto.AnswerDTO;

import com.voter.domain.Theme;
import com.voter.domain.Vote;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class AnswerRequest {

    private String answerText;
    private Theme theme;


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
