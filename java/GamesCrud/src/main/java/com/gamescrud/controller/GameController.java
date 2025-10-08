package com.gamescrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gamescrud.model.Games;
import com.gamescrud.service.GameService;

@RestController
public class GameController {
	@Autowired
	private GameService gameService;
	
	@GetMapping({"/games","/",""})
	public List<Games> getAllGames(){
		List<Games> allGames = gameService.getAllGames();
		return allGames;
	}
	
	@GetMapping({"/games/id"})
	public Games getGamebyId(@RequestParam Long id) {
		Games game = gameService.getGameById(id);
		return game;
	}
	@PostMapping({"/games","/",""})
	public String postallGames() {
		return "Storing game in server";
	}
	
	@PutMapping({"/games/update"})
	public String updateGames() {
		return "Updating Game by ID";
	}
	
	@DeleteMapping({"/games/delete"})
	public String deleteGames() {
		return "Deleting all Games by ID";
	}
}