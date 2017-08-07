package com.voter.dto.AnswerDTO;

import com.voter.domain.Answer;
import com.voter.domain.Theme;
import com.voter.dto.ThemeDTO.ThemeResponse;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class AnswerResponse {

    private Long id;
    private String answerText;
    private ThemeResponse theme;

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
}
