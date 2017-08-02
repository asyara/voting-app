package repository;

import domain.AbstractDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

/**
 * Created by DmitryL on 02.08.2017.
 */
@NoRepositoryBean
public interface BaseRepository <T extends AbstractDomain> extends JpaRepository<T, Long> {
}
