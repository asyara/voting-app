package com.voter.repository;

import com.voter.domain.Answer;
import com.voter.domain.Theme;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by DmitryL on 02.08.2017.
 */
public interface AnswerRepository extends BaseRepository<Answer> {
    @Query(value = "SELECT a FROM Answer as a WHERE a.theme.id = :theme")
    List<Answer> findByTheme(@Param("theme") Long theme);
}
