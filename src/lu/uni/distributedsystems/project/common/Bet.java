package lu.uni.distributedsystems.project.common;

public class Bet {
	
	private static int count = 0;
	private int id = 0;
	private int matchID;
	private int amount;
	private String team;
	private float odds;
	private String gamblerID;
	private String bookieID;
	
	
	
	
	public Bet(int matchID, int amount, String team, float odds, String gamblerID,
			String bookieID) {
		id = ++count;
		this.matchID = matchID;
		this.amount = amount;
		this.team = team;
		this.odds = odds;
		this.gamblerID = gamblerID;
		this.bookieID = bookieID;
	}

	public int getId() {
		return id;
	}

	public int getMatchID() {
		return matchID;
	}
	public void setMatchID(int matchID) {
		this.matchID = matchID;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public float getOdds() {
		return odds;
	}
	public void setOdds(float odds) {
		this.odds = odds;
	}
	public String getGamblerID() {
		return gamblerID;
	}
	public void setGamblerID(String gamblerID) {
		this.gamblerID = gamblerID;
	}
	public String getBookieID() {
		return bookieID;
	}
	public void setBookieID(String bookieID) {
		this.bookieID = bookieID;
	}

}