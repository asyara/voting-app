package com.voter.dto.VoteDTO;

import com.voter.domain.Answer;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class VoteRequest {

    private String email;
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
