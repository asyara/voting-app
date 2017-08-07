package com.voter.domain;

import javax.persistence.*;

/**
 * Created by DmitryL on 01.08.2017.
 */
@Entity
@Table(name = "answer")
public class Answer extends AbstractDomain {

    @Column(name = "answer_text", nullable = false, insertable = true, updatable = true, length = 255)
    private String answerText;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "theme_id", nullable = false)
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
