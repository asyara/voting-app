package service;

import domain.Vote;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public interface VoteService {

    Vote add(Vote answer);
    Vote edit(long id, Vote vote);
    void delete(long id);
    Vote getById(long id);
    List<Vote> getAll();
}
