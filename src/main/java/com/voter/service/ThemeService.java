package com.voter.service;

import com.voter.dto.theme.ThemeRequest;
import com.voter.dto.theme.ThemeResponse;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public interface ThemeService {

    ThemeResponse create(ThemeRequest themeRequest);

    ThemeResponse update(long id, ThemeRequest themeRequest);

    void delete(long id);

    ThemeResponse getById(long id);

    List<ThemeResponse> getAll();
}
