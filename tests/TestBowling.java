import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_isStrike() throws BowlingException {
		
		//BowlingGame game = new BowlingGame();
		Frame frame = new Frame(10,0);
		
		assertTrue("It is strike", frame.isStrike());
		
	}

}
