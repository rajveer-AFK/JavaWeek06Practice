
public class BaseballGame {
	
	private String teamOneName;
	private String teamTwoName;
	private final int NUM_INNINGS = 9;
	private int teamScores[][];
	
	
	public BaseballGame() {
		for(int row = 0; row < teamScores.length; row++) {
			for(int score = 0; score < teamScores[row].length; score++) {
				teamScores[row][score] = 0;
			}
		}
	}
	
	public String getTeamOneName() {
		return teamOneName;
	}
	public void setTeamOneName(String teamOneName) {
		this.teamOneName = teamOneName;
	}
	public String getTeamTwoName() {
		return teamTwoName;
	}
	public void setTeamTwoName(String teamTwoName) {
		this.teamTwoName = teamTwoName;
	}
	
	public void setScore(int team, int inning, int inningScore) {
			teamScores[inning - 1][team - 1] = inningScore;
	}
	
	public int getInningScore(int team, int inning) {
		return teamScores[inning - 1][team - 1];
	}
	
	public int getNumInnings() {
		return NUM_INNINGS;
	}
	
}
