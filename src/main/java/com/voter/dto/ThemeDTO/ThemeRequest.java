package com.voter.dto.ThemeDTO;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class ThemeRequest {

    private String name;
    private int status;

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
