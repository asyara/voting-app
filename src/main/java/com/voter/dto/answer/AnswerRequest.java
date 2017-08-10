package com.voter.dto.answer;

import com.voter.domain.Theme;

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
