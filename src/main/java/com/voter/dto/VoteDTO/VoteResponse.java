package com.voter.dto.VoteDTO;

import com.voter.domain.Answer;
import com.voter.domain.Vote;
import com.voter.dto.AnswerDTO.AnswerResponse;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class VoteResponse {

    private long id;
    private String email;
    private AnswerResponse answer;

    public VoteResponse(Vote vote) {
        this.id = vote.getId();
        this.email = vote.getEmail();
        this.answer = new AnswerResponse(vote.getAnswer());
    }

    public VoteResponse() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public AnswerResponse getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerResponse answer) {
        this.answer = answer;
    }
}
