package com.louiskoyio.democrud.player;

import org.springframework.data.repository.CrudRepository;

public interface PlayerRepository extends CrudRepository<Player,Integer> {
    public Long countById(Integer id);
}
