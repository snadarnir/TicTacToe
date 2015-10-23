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

        winner = STATE.BLANK;
    }

    public boolean isActive(){
    	return grid != null;
    }

    public void setCircle(int x, int y){
    	grid[y][x] = STATE.CIRCLE;
    }

    public void setCross(int x, int y){
    	grid[y][x] = STATE.CROSS;
    }

    public void setBlank(int x, int y){
    	grid[y][x] = STATE.BLANK;
    }

    public boolean isCircle(int x, int y){
    	return grid[y][x]  == STATE.CIRCLE;
    }

    public boolean isCross(int x, int y){
        return grid[y][x]  == STATE.CROSS;
    }

    public boolean isBlank(int x, int y){
        return grid[y][x]  == STATE.BLANK;
    }

    public void setWinner(STATE s){
    	winner = s;
    }

    public boolean isWinner(STATE s){
    	return winner == s;
    }

    public void cleanGrid(){
    	for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                grid[y][x] = STATE.BLANK;
            }
        }

        winner = STATE.BLANK;
    }

    public boolean isClean(){

    	if(winner != STATE.BLANK) 
    		return false;

    	for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                if(grid[y][x] != STATE.BLANK) 
                	return false;
            }
        }
        return true;
    }

    public boolean isThreeInRow(){
	for(int x = 0; x < grid.length; x++){
		STATE first = grid[0][x];
		STATE second = grid[1][x];
		STATE third = grid[2][x];
		if(first == second && second == third && third != STATE.BLANK){
                        return true;
                }
	}
	for(int y = 0; y < grid.length; y++){
		STATE first = grid[y][0];
		STATE second = grid[y][1];
		STATE third = grid[y][2];
		if(first == second && second == third && third != STATE.BLANK){
			return true;
		}
	}
	STATE leftup = grid[2][0];
	STATE leftdown = grid[0][0];
	STATE mid = grid[1][1];
	STATE rightup = grid[2][2];
	STATE rightdown = grid[0][2];
	if(leftup == mid && mid == rightdown && mid != STATE.BLANK){
		return true;
	}
	if(rightup == mid && mid == leftdown && mid != STATE.BLANK){
		return true;
	}
	return false;
    }			
}

