package com.dvsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
