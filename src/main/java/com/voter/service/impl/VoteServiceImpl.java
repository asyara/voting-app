package com.voter.service.impl;

import com.voter.domain.Answer;
import com.voter.domain.Vote;
import com.voter.dto.VoteDTO.VoteRequest;
import com.voter.dto.VoteDTO.VoteResponse;
import com.voter.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.voter.repository.VoteRepository;
import com.voter.service.VoteService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
@Service
@Transactional
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Autowired
    private AnswerRepository answerRepository;

    @Override
    public VoteResponse create(VoteRequest voteRequest) {
        Vote newVote = new Vote();
        newVote.setAnswer(answerRepository.findOne(voteRequest.getAnswer().getId()));
        newVote.setEmail(voteRequest.getEmail());
        Vote savedVote = voteRepository.save(newVote);
        VoteResponse response = new VoteResponse(savedVote);
        return response;
    }

    @Override
    public VoteResponse update(long id, VoteRequest voteRequest) {
        Vote editedVote = voteRepository.findOne(id);
        editedVote.setEmail(voteRequest.getEmail());
        Vote savedVote = voteRepository.save(editedVote);
        VoteResponse response = new VoteResponse(savedVote);
        return response;
    }

    @Override
    public void delete(long id) {
        voteRepository.delete(id);
    }

    @Override
    public VoteResponse getById(long id) {
        Vote vote = voteRepository.getOne(id);
        VoteResponse response = new VoteResponse(vote);
        return response;
    }

    @Override
    public List<VoteResponse> getAll() {
        List<Vote> votes = voteRepository.findAll();
        List<VoteResponse> responses = new ArrayList<>();
        for (int i = 0; i < votes.size(); i++) {
            VoteResponse response = new VoteResponse(votes.get(i));
            responses.add(response);
        }
        return responses;
    }
}
