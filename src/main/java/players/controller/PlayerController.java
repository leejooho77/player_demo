package players.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import players.model.Player;
import players.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);
	
	@RequestMapping(value="/players", method=RequestMethod.GET)
	public List<Player> showPlayers() {
		LOGGER.info("Loading All Players from DB.....");
		return playerService.showPlayers();
	}
	
	@RequestMapping(value="/players/{team}", method=RequestMethod.GET)
	public List<Player> showPlayersByTeam(@PathVariable("team") String team) {
		LOGGER.info("Loading " + team + " Players from DB.....");
		return playerService.showPlayersByTeam(team);
	}
	
	@RequestMapping(value="/player", method=RequestMethod.GET)
	public Player showPlayersById(@RequestParam int id) {
		LOGGER.info("Loading " + id + " Player from DB.....");
		return playerService.showPlayerById(id);
	}
}