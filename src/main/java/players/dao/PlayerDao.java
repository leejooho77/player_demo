package players.dao;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import players.model.Player;

@Component
public class PlayerDao {
	
	private final String GET_PLAYERS = "SELECT * FROM player";
	private final String WHERE_TEAM = " WHERE team=";
	private final String WHERE_ID = " WHERE id=";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Player> showPlayers() {
		return jdbcTemplate.query(GET_PLAYERS, new BeanPropertyRowMapper<>(Player.class));
	}
	
	public List<Player> showPlayersByTeam(String team) {
		return jdbcTemplate.query(GET_PLAYERS + WHERE_TEAM + "\'" + team + "\'", new BeanPropertyRowMapper<>(Player.class));
	}
	
	public Player showPlayerById(int id) {
		return jdbcTemplate.queryForObject(GET_PLAYERS + WHERE_ID + id, new BeanPropertyRowMapper<>(Player.class));
	}
	
}