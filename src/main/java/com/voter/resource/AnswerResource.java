package com.voter.resource;

import com.voter.dto.answer.AnswerRequest;
import com.voter.dto.answer.AnswerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.voter.service.AnswerService;

import java.util.List;

/**
 * Created by DmitryL on 03.08.2017.
 */
@RestController
@RequestMapping("/answers")
public class AnswerResource {

    @Autowired
    private AnswerService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<AnswerResponse> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public AnswerResponse getById(@PathVariable("id") long id) {
        return service.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public AnswerResponse create(@RequestBody AnswerRequest request) {
        return service.create(request);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public AnswerResponse update(@PathVariable("id") long id,
                                 @RequestBody AnswerRequest request) {
        AnswerResponse response = service.update(id, request);
        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        service.delete(id);
    }
}
