
public class LittleLeagueBaseballGame extends BaseballGame {
	
	private final int NUM_INNINGS = 6;
	
	public LittleLeagueBaseballGame() {
		super();
	}
	
	@Override
	public int getNumInnings() {
		return NUM_INNINGS;
	}
}
