package com.pl.premier_zone.player;

import jakarta.persistence.*;

@Entity
@Table(name = "player_statistic")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", unique = true)
    private String name;
    private String nation;
    private String position;
    private String cover;
    private Integer age;
    private Integer matchesPlayed;
    private Integer starts;
    private Double minutesPlayed;
    private Double goals;
    private Double assists;
    private Double penaltiesScored;
    private Double yellowCards;
    private Double redCards;
    private Double expectedGoals;
    private Double expectedAssists;
    private String team;

    public Player() {
    }

    public Player(String team, Double expectedAssists, Double expectedGoals, Double redCards, Double yellowCards, Double penaltiesScored, Double assists, Double goals, Double minutesPlayed, Integer starts, Integer matchesPlayed, Integer age, String position, String nation, String name, String cover) {
        this.team = team;
        this.expectedAssists = expectedAssists;
        this.expectedGoals = expectedGoals;
        this.redCards = redCards;
        this.yellowCards = yellowCards;
        this.penaltiesScored = penaltiesScored;
        this.assists = assists;
        this.goals = goals;
        this.minutesPlayed = minutesPlayed;
        this.starts = starts;
        this.matchesPlayed = matchesPlayed;
        this.age = age;
        this.position = position;
        this.nation = nation;
        this.name = name;
        this.cover = cover;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(Integer matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    public Integer getStarts() {
        return starts;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public Double getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Double minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public Double getGoals() {
        return goals;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public Double getAssists() {
        return assists;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public Double getPenaltiesScored() {
        return penaltiesScored;
    }

    public void setPenaltiesScored(Double penaltiesScored) {
        this.penaltiesScored = penaltiesScored;
    }

    public Double getYellowCards() {
        return yellowCards;
    }

    public void setYellowCards(Double yellowCards) {
        this.yellowCards = yellowCards;
    }

    public Double getRedCards() {
        return redCards;
    }

    public void setRedCards(Double redCards) {
        this.redCards = redCards;
    }

    public Double getExpectedGoals() {
        return expectedGoals;
    }

    public void setExpectedGoals(Double expectedGoals) {
        this.expectedGoals = expectedGoals;
    }

    public Double getExpectedAssists() {
        return expectedAssists;
    }

    public void setExpectedAssists(Double expectedAssists) {
        this.expectedAssists = expectedAssists;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }
}
