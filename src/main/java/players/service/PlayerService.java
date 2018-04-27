package players.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import players.dao.PlayerDao;
import players.model.Player;

@Component
public class PlayerService {
	
	@Autowired
	PlayerDao playerDao;
	
	public List<Player> showPlayers() {
		return playerDao.showPlayers();
	}
	
	public List<Player> showPlayersByTeam(String team) {
		return playerDao.showPlayersByTeam(team);
	}
	
	public Player showPlayerById(int id) {
		return playerDao.showPlayerById(id);
	}
}