package com.igordalpicolo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igordalpicolo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
