package service.impl;

import domain.Theme;
import org.springframework.beans.factory.annotation.Autowired;
import repository.ThemeRepository;
import service.ThemeService;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */

@Transactional
public class ThemeServiceImpl implements ThemeService {

    @Autowired
    private ThemeRepository themeRepository;

    @Override
    public Theme add(Theme theme) {
        Theme newTheme = new Theme();
        newTheme.setName(theme.getName());
        newTheme.setStatus(theme.getStatus());
        Theme savedTheme = themeRepository.saveAndFlush(theme);
        return savedTheme;
    }

    @Override
    public Theme edit(long id, Theme theme) {
        Theme editedTheme = themeRepository.findOne(id);
        editedTheme.setStatus(theme.getStatus());
        editedTheme.setName(theme.getName());
        return themeRepository.saveAndFlush(editedTheme);
    }

    @Override
    public void delete(long id) {
        themeRepository.delete(id);
    }

    @Override
    public Theme getById(long id) {
        return themeRepository.getOne(id);
    }

    @Override
    public List<Theme> getAll() {
        return themeRepository.findAll();
    }
}
