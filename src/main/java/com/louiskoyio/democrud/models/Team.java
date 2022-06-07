package com.louiskoyio.democrud.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "teams")
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String teamName;
    private int teamCaptain;

    public Team() {
    }

    public Team(int teamId, String teamName, int teamCaptain) {
        this.id = teamId;
        this.teamName = teamName;
        this.teamCaptain = teamCaptain;
    }

    public int getTeamId() {
        return id;
    }

    public Team setTeamId(int teamId) {
        this.id = teamId;
        return this;
    }

    public String getTeamName() {
        return teamName;
    }

    public Team setTeamName(String teamName) {
        this.teamName = teamName;
        return this;
    }

    public int getTeamCaptain() {
        return teamCaptain;
    }

    public Team setTeamCaptain(int teamCaptain) {
        this.teamCaptain = teamCaptain;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return id == team.id && teamCaptain == team.teamCaptain && Objects.equals(teamName, team.teamName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teamName, teamCaptain);
    }
}
