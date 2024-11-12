package com.igordalpicolo.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.igordalpicolo.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
