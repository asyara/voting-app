package com.voter.service.impl;

import com.voter.domain.Theme;
import com.voter.dto.ThemeDTO.ThemeRequest;
import com.voter.dto.ThemeDTO.ThemeResponse;
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

    @Override
    public ThemeResponse create(ThemeRequest themeRequest) {
        Theme newTheme = new Theme();
        newTheme.setName(themeRequest.getName());
        newTheme.setStatus(themeRequest.getStatus());
        Theme savedTheme = themeRepository.save(newTheme);
        ThemeResponse response = new ThemeResponse(savedTheme);
        return response;
    }

    @Override
    public ThemeResponse update(long id, ThemeRequest themeRequest) {
        Theme editedTheme = themeRepository.findOne(id);
        editedTheme.setName(themeRequest.getName());
        editedTheme.setStatus(themeRequest.getStatus());
        ThemeResponse response = new ThemeResponse(editedTheme);
        return response;
    }

    @Override
    public void delete(long id) {
        themeRepository.delete(id);
    }

    @Override
    public ThemeResponse getById(long id) {
        Theme theme = themeRepository.getOne(id);
        ThemeResponse response = new ThemeResponse(theme);
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
