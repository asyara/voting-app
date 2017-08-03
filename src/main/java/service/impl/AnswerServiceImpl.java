package service.impl;

import domain.Answer;
import dto.AnswerDTO.AnswerRequest;
import dto.AnswerDTO.AnswerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import repository.AnswerRepository;
import service.AnswerService;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */

@Transactional
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public AnswerResponse create(AnswerRequest answerRequest) {
        Answer newAnswer = new Answer();
        newAnswer.setTheme(answerRequest.getTheme());
        newAnswer.setAnswerText(answerRequest.getAnswerText());
        Answer savedAnswer = answerRepository.saveAndFlush(newAnswer);
        AnswerResponse response = new AnswerResponse(savedAnswer);
        return response;
    }

    @Override
    public AnswerResponse update(long id, AnswerRequest answerRequest) {
        Answer editedAnswer = answerRepository.findOne(id);
        editedAnswer.setTheme(answerRequest.getTheme());
        editedAnswer.setAnswerText(answerRequest.getAnswerText());
        AnswerResponse response = new AnswerResponse(editedAnswer);
        return response;
    }

    @Override
    public void delete(long id) {
        answerRepository.delete(id);
    }

    @Override
    public AnswerResponse getById(long id) {
        Answer answer = answerRepository.getOne(id);
        AnswerResponse response = new AnswerResponse(answer);
        return response;
    }

    @Override
    public List<AnswerResponse> getAll() {
        List<Answer> answers = answerRepository.findAll();
        List<AnswerResponse> responses = new ArrayList<>();
        for (int i = 0; i < answers.size(); i++) {
            AnswerResponse response = new AnswerResponse(answers.get(i));
            responses.add(response);
        }
        return responses;
    }
}
