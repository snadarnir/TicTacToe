package is.ru.TicTacToe;

public class TicTacToe {
	public enum STATE {BLANK, CROSS, CIRCLE}

    private STATE[][] grid = new STATE[3][3];
    private STATE winner;

    public TicTacToe() {
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                grid[x][y] = STATE.BLANK;
            }
        }
    }

    public boolean isActive(){
    	return grid != null;
    }

	public static int add(String text){
		if(text.equals("")){
			return 0;
		}
		else {
			return 1;
		}
	}

}