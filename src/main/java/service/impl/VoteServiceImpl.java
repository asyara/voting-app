package service.impl;

import domain.Vote;
import org.springframework.beans.factory.annotation.Autowired;
import repository.VoteRepository;
import service.VoteService;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public class VoteServiceImpl implements VoteService {

    @Autowired
    private VoteRepository voteRepository;

    @Override
    public Vote add(Vote vote) {
        Vote newVote = new Vote();
        newVote.setAnswer(vote.getAnswer());
        newVote.setEmail(vote.getEmail());
        Vote savedVote = voteRepository.saveAndFlush(vote);
        return savedVote;
    }

    @Override
    public Vote edit(long id, Vote vote) {
        Vote editedVote = voteRepository.findOne(id);
        editedVote.setEmail(vote.getEmail());
        editedVote.setAnswer(vote.getAnswer());
        return voteRepository.saveAndFlush(editedVote);
    }

    @Override
    public void delete(long id) {
        voteRepository.delete(id);
    }

    @Override
    public Vote getById(long id) {
        return voteRepository.getOne(id);
    }

    @Override
    public List<Vote> getAll() {
        return voteRepository.findAll();
    }
}
