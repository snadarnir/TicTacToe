package is.ru.TicTacToe;

public class TicTacToe {
	public enum STATE {BLANK, CROSS, CIRCLE}

    private STATE[][] grid = new STATE[3][3];
    private STATE winner;

    public TicTacToe() {
        for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                grid[y][x] = STATE.BLANK;
            }
        }
    }

    public boolean isActive(){
    	return grid != null;
    }

    public void setCircle(int x, int y){
    	grid[y][x] = STATE.CIRCLE;
    }

    public boolean IsCircle(int x, int y){
    	return grid[y][x]  == STATE.CIRCLE;
    }

}