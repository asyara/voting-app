package service;

import domain.Answer;
import dto.AnswerDTO.AnswerRequest;
import dto.AnswerDTO.AnswerResponse;

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
