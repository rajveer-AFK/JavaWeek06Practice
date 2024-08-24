
public class HighSchoolBaseballGame extends BaseballGame {
	
	private final int NUM_INNINGS = 7;
	
	public HighSchoolBaseballGame() {
		super();
	}
	
	@Override
	public int getNumInnings() {
		return NUM_INNINGS;
	}
	
}
