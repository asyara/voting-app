package com.voter.dto.answer;

import com.voter.domain.Answer;
import com.voter.dto.theme.ThemeResponse;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class AnswerResponse {

    private Long id;
    private String answerText;
    private ThemeResponse theme;
    private int count;

    public AnswerResponse(Answer answer) {
        this.id = answer.getId();
        this.answerText = answer.getAnswerText();
        this.theme = new ThemeResponse(answer.getTheme());
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

    public ThemeResponse getTheme() {
        return theme;
    }

    public void setTheme(ThemeResponse theme) {
        this.theme = theme;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
