package dto.VoteDTO;

import domain.Answer;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class VoteResponse {

    private long id;

    private String email;

    private Answer answer;

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

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }
}
