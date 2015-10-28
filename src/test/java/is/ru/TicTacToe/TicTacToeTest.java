package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class TicTacToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeTest");
    }

    private TicTacToe t;

@Test
	public void testEmptyString() throws Exception{
		assertEquals(0, Calculator.add(""));
	}
    @Before
    public void setUp() {
        t = new TicTacToe();
    }

	@Test
	public void testIsActive() {
		assertEquals(true , t.isActive());
	}

	@Test
	public void testIsCircle() {
		t.setCircle(1, 1);

		assertEquals(true , t.isCircle(1,1));
	}

	@Test
	public void testIsCross() {
    	t.setCross(0,0);

        assertEquals(true , t.isCross(0,0));
    }

    @Test
	public void testIsCircle2() {
		assertEquals(false , t.isCircle(0,0));
	}

	@Test
    public void testIsCross2() {
        assertEquals(false , t.isCross(1,1));
    }

    @Test
    public void testIsBlank() {
        assertEquals(true , t.isBlank(1,0));
    }

    @Test
    public void testIsWinner() {
    	t.setWinner(TicTacToe.STATE.CIRCLE);

        assertEquals(true , t.isWinner(TicTacToe.STATE.CIRCLE));
    }

    @Test
    public void testIsWinner2() {
    	t.setWinner(TicTacToe.STATE.CROSS);
    	
        assertEquals(false , t.isWinner(TicTacToe.STATE.CIRCLE));
    }

    @Test
    public void testIsClean() {
    	t.setCross(0,0);	
        assertEquals(false , t.isClean());
    }

    @Test
    public void testIsClean2(){
    	t.cleanGrid();
    	
        assertEquals(true , t.isClean());
    }

	@Test
    public void testThreeInRow(){
	assertEquals(false, t.isThreeInRow(TicTacToe.STATE.CIRCLE));
    }

	@Test
    public void testThreeInRow2(){
    	t.setCircle(0,0);
    	t.setCircle(0,1);
        t.setCircle(0,2);
	assertEquals(true, t.isThreeInRow(TicTacToe.STATE.CIRCLE));
    }

        @Test
    public void testThreeInRow3(){
        t.setCircle(0,0);
        t.setCircle(0,1);
        t.setCircle(0,2);
        assertEquals(false, t.isThreeInRow(TicTacToe.STATE.CROSS));
    }
	
	@Test
    public void testAnyFreeSpotLeft(){
        assertEquals(true, t.isAnyFreeSpotLeft());
    }
	 
	@Test
    public void testAnyFreeSpotLeft2(){
        t.setCircle(0,0);
        t.setCircle(0,1);
        t.setCircle(0,2);
        t.setCircle(1,0);
        t.setCircle(1,1);
        t.setCircle(1,2);
        t.setCircle(2,0);
        t.setCircle(2,1);
        t.setCircle(2,2);
        assertEquals(false, t.isAnyFreeSpotLeft());
    }

    @Test
    public void testAnyFreeSpotLeft3(){
	t.setCircle(0,0);
        assertEquals(true, t.isAnyFreeSpotLeft());
    }
}
