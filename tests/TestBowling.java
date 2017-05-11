import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test_isStrike() throws BowlingException {
		
		BowlingGame game = new BowlingGame();
		Frame frame = new Frame(10,0);
		
		assertEquals("Incorrect when firstThrow is 10 and secondThrow is 0", frame.isStrike());
		
	}

}
