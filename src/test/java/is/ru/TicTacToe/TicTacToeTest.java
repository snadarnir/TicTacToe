package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.Before;

public class TicTacToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeTest");
    }

    private TicTacToe t;

    @Before
    public void setUp() {
        t = new TicTacToe();
    }

	@Test
	public void testIsActive() {
		assertEquals(true , t.isActive());
	}
}