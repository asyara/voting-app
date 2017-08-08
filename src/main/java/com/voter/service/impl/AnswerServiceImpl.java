package com.voter.service.impl;

import com.voter.domain.Answer;
import com.voter.domain.Theme;
import com.voter.dto.AnswerDTO.AnswerRequest;
import com.voter.dto.AnswerDTO.AnswerResponse;
import com.voter.dto.ThemeDTO.ThemeResponse;
import com.voter.repository.ThemeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.voter.repository.AnswerRepository;
import com.voter.service.AnswerService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
@Service
@Transactional
public class AnswerServiceImpl implements AnswerService {

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public AnswerResponse create(AnswerRequest answerRequest) {
        Answer newAnswer = new Answer();
        Theme newTheme = new Theme();
        newTheme.setId(answerRequest.getTheme().getId());
        newAnswer.setTheme(themeRepository.findOne(newTheme.getId()));
        newAnswer.setAnswerText(answerRequest.getAnswerText());
        Answer savedAnswer = answerRepository.save(newAnswer);
        AnswerResponse response = new AnswerResponse(savedAnswer);
        return response;
    }

    @Override
    public AnswerResponse update(long id, AnswerRequest answerRequest) {
        Answer editedAnswer = answerRepository.findOne(id);
        editedAnswer.setAnswerText(answerRequest.getAnswerText());
        Answer savedAnswer = answerRepository.save(editedAnswer);
        AnswerResponse response = new AnswerResponse(savedAnswer);
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
