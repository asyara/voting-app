package com.voter.service.impl;

import com.voter.domain.Answer;
import com.voter.domain.Theme;
import com.voter.dto.answer.AnswerResponse;
import com.voter.dto.theme.ThemeRequest;
import com.voter.dto.theme.ThemeResponse;
import com.voter.repository.AnswerRepository;
import com.voter.repository.VoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.voter.repository.ThemeRepository;
import com.voter.service.ThemeService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
@Service
@Transactional
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public ThemeResponse create(ThemeRequest themeRequest) {
        Theme newTheme = new Theme();
        newTheme.setName(themeRequest.getName());
        newTheme.setStatus(0);
        Theme savedTheme = themeRepository.save(newTheme);

        for (int i = 0; i < themeRequest.getAnswers().size(); i++) {
            Answer newAnswer = new Answer();
            newAnswer.setAnswerText(themeRequest.getAnswers().get(i));
            newAnswer.setTheme(savedTheme);
            Answer savedAnswer = answerRepository.save(newAnswer);
        }
        ThemeResponse response = new ThemeResponse(savedTheme);
        return response;
    }

    @Override
    public ThemeResponse update(long id, ThemeRequest themeRequest) {
        Theme editedTheme = themeRepository.findOne(id);
        editedTheme.setName(themeRequest.getName());
        List<Answer> answers = answerRepository.findByTheme(editedTheme.getId());
        ThemeResponse response = new ThemeResponse(editedTheme, answers);
        for (AnswerResponse answer : response.getAnswers()) {
            answer.setCount(voteRepository.countByAnswer(answer.getId()));
        }
        return response;
    }

    @Override
    public void delete(long id) {
        themeRepository.delete(id);
    }

    @Override
    public ThemeResponse getById(long id) {
        Theme theme = themeRepository.getOne(id);
        List<Answer> answers = answerRepository.findByTheme(theme.getId());
        ThemeResponse response = new ThemeResponse(theme, answers);
        for (AnswerResponse answer : response.getAnswers()) {
            answer.setCount(voteRepository.countByAnswer(answer.getId()));
        }
        return response;
    }

    @Override
    public List<ThemeResponse> getAll() {
        List<Theme> themes = themeRepository.findAll();
        List<ThemeResponse> responses = new ArrayList<>();
        for (int i = 0; i < themes.size(); i++) {
            ThemeResponse response = new ThemeResponse(themes.get(i));
            responses.add(response);
        }
        return responses;
    }
}
