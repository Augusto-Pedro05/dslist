package com.dvsuperior.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dvsuperior.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
	
}
