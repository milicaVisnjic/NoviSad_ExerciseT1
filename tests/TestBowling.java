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
	
	@Test
	public void test_isSpare() throws BowlingException {
		
		Frame frame = new Frame(5,5);
		assertTrue("It is spare", frame.isSpare());
	}
	
	public void test_IsTheFrameResultCorrectlyCounted() throws BowlingException {
		
		Frame frame = new Frame(3,6);
		int expectedResult=9;
		assertEquals("Incorrect when", expectedResult, frame.score());
	}

}
