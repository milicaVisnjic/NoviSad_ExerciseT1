import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 20:52
// Student ID: IT29/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	private int bonuss;
	
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		
	
		frames.add(frame);
		
		//to be implemented
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		
		for(int i=0;i<10;i++)
		{
			if(bonus.isSpare())
			{
				bonuss=frames.get(i+1).score(); 
			}
			else if(bonus.isStrike())
			{
				bonuss=frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow(); 
			}
		}
		
	}
	
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		return bonus.getFirstThrow() + bonus.getSecondThrow(); 
	}
}
