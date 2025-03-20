package com.pl.premier_zone.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<List<Player>> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) String nation) {

        List<Player> players;

        if (team != null && position != null) {
            players = playerService.getPlayersByTeamAndPosition(team, position);
        } else if (team != null) {
            players = playerService.getPlayersFromTeam(team);
        } else if (name != null) {
            players = playerService.getPlayersByName(name);
        } else if (position != null) {
            players = playerService.getPlayersByPosition(position);
        } else if (nation != null) {
            players = playerService.getPlayersByNation(nation);
        } else {
            players = playerService.getPlayers();
        }

        return new ResponseEntity<>(players, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Player> addPlayer(@RequestBody Player player) {
        Player createdPlayer = playerService.addPlayer(player);
        return new ResponseEntity<>(createdPlayer, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Player> updatePlayer(@RequestBody Player updatedPlayer) {
        Player resultPlayer = playerService.updatePlayer(updatedPlayer);
        if (resultPlayer != null) {
            return new ResponseEntity<>(resultPlayer, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{playerName}")
    public ResponseEntity<String> deletePlayer(@PathVariable String playerName) {
        playerService.deletePlayer(playerName);
        return new ResponseEntity<>("Player deleted successfully", HttpStatus.OK);
    }
}