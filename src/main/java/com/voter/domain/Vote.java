package com.voter.domain;

import javax.persistence.*;

/**
 * Created by DmitryL on 01.08.2017.
 */
@Entity
@Table(name = "vote")
public class Vote extends AbstractDomain {

    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 255)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "answer_id", nullable = false)
    private Answer answer;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
