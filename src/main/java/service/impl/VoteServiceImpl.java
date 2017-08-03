package service.impl;

import domain.Vote;
import dto.AnswerDTO.AnswerRequest;
import dto.VoteDTO.VoteRequest;
import dto.VoteDTO.VoteResponse;
import org.springframework.beans.factory.annotation.Autowired;
import repository.VoteRepository;
import service.VoteService;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public VoteResponse create(VoteRequest voteRequest) {
        Vote newVote = new Vote();
        newVote.setAnswer(voteRequest.getAnswer());
        newVote.setEmail(voteRequest.getEmail());
        Vote savedVote = voteRepository.saveAndFlush(newVote);
        VoteResponse response = new VoteResponse(savedVote);
        return response;
    }

    @Override
    public VoteResponse update(long id, VoteRequest voteRequest) {
        Vote editedVote = voteRepository.findOne(id);
        editedVote.setEmail(editedVote.getEmail());
        editedVote.setAnswer(editedVote.getAnswer());
        VoteResponse response = new VoteResponse(editedVote);
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
