package com.voter.dto.theme;

import com.voter.domain.Answer;
import com.voter.domain.Theme;
import com.voter.dto.answer.AnswerResponse;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class ThemeResponse {

    private long id;
    private String name;
    private int status;
    private List<AnswerResponse> answers;

    public ThemeResponse(Theme theme) {
        this.id = theme.getId();
        this.name = theme.getName();
        this.status = theme.getStatus();
    }

    public ThemeResponse(Theme theme, List<Answer> answers) {
        this.id = theme.getId();
        this.name = theme.getName();
        this.status = theme.getStatus();
        this.answers = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            AnswerResponse response = new AnswerResponse(answers.get(i));
            this.answers.add(response);
        }
    }

    public ThemeResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<AnswerResponse> getAnswers() {
        return answers;
    }

    public void setAnswers(List<AnswerResponse> answers) {
        this.answers = answers;
    }
}