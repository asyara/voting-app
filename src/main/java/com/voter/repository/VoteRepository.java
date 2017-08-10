package com.voter.repository;

import com.voter.domain.Vote;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by DmitryL on 02.08.2017.
 */
public interface VoteRepository extends BaseRepository<Vote> {
    @Query(value = "select count(v) from Vote v where v.answer.id = :answerId")
    int countByAnswer(@Param("answerId") Long id);
}
