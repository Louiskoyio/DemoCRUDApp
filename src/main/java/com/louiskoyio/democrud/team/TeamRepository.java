package com.louiskoyio.democrud.team;

import com.louiskoyio.democrud.player.Player;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface TeamRepository extends CrudRepository<Team,Integer> {
    Long countById(Integer id);

    @Query("SELECT Player.fname, Player.lname,Player.nationalId, Player.phoneNumber, Team.teamName FROM Player JOIN Team on Player.teamId = Team.id where Player.teamId =:id")
    List<Player> players(@Param("id") Integer id);
}
