package com.voter.dto.ThemeDTO;

import com.voter.domain.Theme;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class ThemeResponse {

    private long id;
    private String name;
    private int status;

    public ThemeResponse(Theme theme) {
        this.id = theme.getId();
        this.name = theme.getName();
        this.status = theme.getStatus();
    }

    public ThemeResponse() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
