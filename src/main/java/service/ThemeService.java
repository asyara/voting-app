package service;

import domain.Theme;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public interface ThemeService {

    Theme add(Theme answer);
    Theme edit(long id, Theme theme);
    void delete(long id);
    Theme getById(long id);
    List<Theme> getAll();
}
