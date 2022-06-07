package com.louiskoyio.democrud.player;

import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PlayerRepository extends CrudRepository<Player,Integer> {
    public Long countById(Integer id);
    public List<Player> findByTeamId(Integer id);
}
