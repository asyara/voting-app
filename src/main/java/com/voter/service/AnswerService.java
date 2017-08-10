package com.voter.service;

import com.voter.dto.answer.AnswerRequest;
import com.voter.dto.answer.AnswerResponse;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public interface AnswerService {

    AnswerResponse create(AnswerRequest answerRequest);

    AnswerResponse update(long id, AnswerRequest answerRequest);

    void delete(long id);

    AnswerResponse getById(long id);

    List<AnswerResponse> getAll();

}
