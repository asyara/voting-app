package com.voter.resource;

import com.voter.dto.VoteDTO.VoteRequest;
import com.voter.dto.VoteDTO.VoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.voter.service.VoteService;

import java.util.List;

/**
 * Created by DmitryL on 03.08.2017.
 */

@RestController
@RequestMapping("/votes")
public class VoteResource {

    @Autowired
    private VoteService service;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<VoteResponse> getAll() {
        return service.getAll();
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public VoteResponse getById(@PathVariable("id") long id) {
        return service.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public VoteResponse create(@RequestBody VoteRequest request) {
        return service.create(request);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @ResponseBody
    public VoteResponse update(@PathVariable("id") long id,
                               @RequestBody VoteRequest request) {
        VoteResponse response = service.update(id, request);
        return response;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("id") long id) {
        service.delete(id);

    }
}