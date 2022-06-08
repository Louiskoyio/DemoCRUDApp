package com.louiskoyio.democrud.fixture;

import com.louiskoyio.democrud.team.Team;
import org.springframework.data.repository.CrudRepository;

public interface FixtureRepository extends CrudRepository<Fixture,Integer> {
    public Long countById(Integer id);
}
