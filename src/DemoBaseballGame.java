import javax.swing.JOptionPane;

public class DemoBaseballGame {

	public static void main(String[] args) {
		
		BaseballGame baseballGameType = createBaseballGameType();
		
		String teamOneName = JOptionPane.showInputDialog(null, "Enter a name for team one");
		baseballGameType.setTeamOneName(teamOneName);
		
		String teamTwoName = JOptionPane.showInputDialog(null, "Enter a name for team two");
		baseballGameType.setTeamTwoName(teamTwoName);
		
		playGame(baseballGameType, teamOneName, teamTwoName);
		
	}
	
	public static BaseballGame createBaseballGameType() {
		String gameTypeMenu =  "[1] Baseball Game" 
				  		   + "\n[2] High School Baseball Game"
				  		   + "\n[3] Little League Baseball Game";
				
		int userGameTypeChoice = Integer.parseInt(JOptionPane.showInputDialog(null, gameTypeMenu, "Select Game Type", 1));
		
		BaseballGame baseballGameType = null;
		
		switch(userGameTypeChoice) {
			case 1:
				baseballGameType = new BaseballGame();
				break;
			case 2:
				baseballGameType = new HighSchoolBaseballGame();
				break;
			case 3:
				baseballGameType = new LittleLeagueBaseballGame();
				break;
		}
		
		return baseballGameType;
	}
	
	public static void playGame(BaseballGame baseballGame, String teamOneName, String teamTwoName) {
		int teamOneScore = 0;
		int teamTwoScore = 0;
		
		for(int inning = 1; inning <= baseballGame.getNumInnings(); inning++) {
			
			int teamOneInningScore = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the score", teamOneName + " inning " + inning + " score", 1));
			teamOneScore += teamOneInningScore;
			baseballGame.setScore(1, inning, teamOneInningScore);
			
			int teamTwoInningScore = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the score", teamTwoName + " inning " + inning + " score", 1));
			teamTwoScore += teamTwoInningScore;
			baseballGame.setScore(2, inning, teamTwoInningScore);
			
			JOptionPane.showMessageDialog(null, teamOneName + ": " + teamOneScore + "\n" + teamTwoName + ": " + teamTwoScore, "Scores so far", 1);
		}
		
		if(teamOneScore > teamTwoScore) {
			JOptionPane.showMessageDialog(null, "The winner of the game is team " + teamOneName, "Game Winner", 1);
		}
		else if(teamTwoScore > teamOneScore) {
			JOptionPane.showMessageDialog(null, "The winner of the game is team " + teamTwoName, "Game Winner", 1);
		}
		else {
			JOptionPane.showMessageDialog(null, "The game is a tie, no winner", "Game Winner", 1);
		}	
	}
}
