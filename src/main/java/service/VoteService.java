package service;

import domain.Vote;
import dto.VoteDTO.VoteRequest;
import dto.VoteDTO.VoteResponse;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public interface VoteService {

    VoteResponse create(VoteRequest voteRequest);

    VoteResponse update(long id, VoteRequest voteRequest);

    void delete(long id);

    VoteResponse getById(long id);

    List<VoteResponse> getAll();
}
