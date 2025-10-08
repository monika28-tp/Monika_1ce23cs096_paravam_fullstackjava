package com.gamescrud.service;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamescrud.model.Game;
import com.gamescrud.model.Games;
import com.gamescrud.repository.GamesRepository;

@Service
public class GameService {
	@Autowired
	private GamesRepository gamesRepository;
	public List<Games> getAllGames(){
		List<Games> games =gamesRepository.findAll();
		return games;
	}
	public Games getGameById(long id) {
		Optional<Games> byId = gamesRepository.findById(id);
		Games game = byId.get();
		return game;
	}
	public void deleteGameById(Long id) {
		gamesRepository.deleteById(id);
	
	}
	public Games updateGameById(Games game, Long id) {
		Optional<Games> oldGame = gamesRepository.findById(id);
		Games oldGame1 = oldGame.get();
		oldGame1.setGameName(game.getGameName());
		oldGame1.setCostPerHour(game.getCostPerHour());
		oldGame1.setStatus(game.getStatus());
		Games save= gamesRepository.save(oldGame1);
		return save;
	}
}
                                                      