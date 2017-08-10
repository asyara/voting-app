package com.voter.resource;

import com.voter.dto.theme.ThemeRequest;
import com.voter.dto.theme.ThemeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.voter.service.ThemeService;

import java.util.List;

/**
 * Created by DmitryL on 03.08.2017.
 */
@RestController
@RequestMapping("/themes")
public class ThemeResource {

    @Autowired
    private ThemeService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<ThemeResponse> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public ThemeResponse getById(@PathVariable("id") long id) {
        return service.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public ThemeResponse create(@RequestBody ThemeRequest request) {
        return service.create(request);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public ThemeResponse update(@PathVariable("id") long id,
                                @RequestBody ThemeRequest request) {
        ThemeResponse response = service.update(id, request);
        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        service.delete(id);
    }


}
