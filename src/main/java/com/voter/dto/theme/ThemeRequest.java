package com.voter.dto.theme;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class ThemeRequest {

    private String name;
    private List<String> answers;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }
}
