package players.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import players.model.Player;
import players.service.PlayerService;

@Controller
public class PlayerController {
	
	@Autowired
	PlayerService playerService;
	
	private final Logger LOGGER = LoggerFactory.getLogger(PlayerController.class);
	
	@RequestMapping(value="/players", method=RequestMethod.GET)
	public String showPlayers(Model model) {
		List<Player> player_list = new ArrayList<>();
		LOGGER.info("Loading All Players from DB.....");
		player_list = playerService.showPlayers();
		model.addAttribute("player", player_list);
		return "players";
	}
	
	@RequestMapping(value="/players/{team}", method=RequestMethod.GET)
	public String showPlayersByTeam(@PathVariable("team") String team, Model model) {
		List<Player> player_list = new ArrayList<>();
		player_list = playerService.showPlayersByTeam(team);
		LOGGER.info("Loading " + team + " Players from DB.....");
		model.addAttribute("team", player_list);
		return team;
	}
}