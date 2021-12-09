package com.amolsoftwares.IPLDashboard.repository;

import com.amolsoftwares.IPLDashboard.model.Team;

import org.springframework.data.repository.CrudRepository;

public interface TeamRepository extends CrudRepository<Team, Long> {

    Team findByTeamName(String teamName);
    
}
