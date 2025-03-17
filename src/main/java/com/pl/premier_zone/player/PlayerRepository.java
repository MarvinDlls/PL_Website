package com.pl.premier_zone.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<Player, String> {

    void deleteByName(String playerName);

    Optional<Player> findByName(String name);

    List<Player> findByTeam(String teamName);

    List<Player> findByNameContainingIgnoreCase(String searchText);

    List<Player> findByPositionContainingIgnoreCase(String searchText);

    List<Player> findByNationContainingIgnoreCase(String searchText);

    List<Player> findByTeamAndPosition(String team, String position);
}
