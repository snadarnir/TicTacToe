package is.ru.TicTacToe;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TicTacToeTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.TicTacToe.TicTacToeTest");
    }

	@Test
	public void testEmptyString() {
		assertEquals(0 , TicTacToe.add(""));
	}
}