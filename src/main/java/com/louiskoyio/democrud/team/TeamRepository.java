package com.louiskoyio.democrud.team;

import com.louiskoyio.democrud.player.Player;
import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team,Integer> {
    public Long countById(Integer id);
}
