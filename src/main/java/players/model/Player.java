package players.model;

public class Player {
	
	 private int back_number;
	 private String name;
	 private String position;
	 private String team;
	 
	 public Player() {}
	 
	 public Player(int back_number, String name, String position, String team) {
		this.back_number = back_number;
		this.name = name;
		this.position = position;
		this.team = team;
	 }

	public int getBack_number() {
		return back_number;
	}

	public void setBack_number(int back_number) {
		this.back_number = back_number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public String getTeam() {
		return team;
	}
	
	public void setTeam(String team) {
		this.team = team;
	}
	 
}