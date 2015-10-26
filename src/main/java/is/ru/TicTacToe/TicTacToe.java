/*TicTacToe
Created by: Snadarnir
University: Reykjavik university - 2015
Authors:
    Ari Hrobjartsson
    Egill Anton Hlodversson
    Gudrun Thorey Sigurbjornsdottir
    Kristofer Andri Kristinsson
    Maria Builien Jonsdottir
Discription:
    Java implemented TicTacToe, With focus on Test Driven Developmente, 
    that the code should be loosely coupled and that the design follow good     
    object oriented design practices.
*/

package is.ru.TicTacToe;

import java.util.Scanner;

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

    // Checks if the object is active
    public boolean isActive(){
    	return grid != null;
    }

    // Sets a Circle in the grid point (x,y)
    public void setCircle(int x, int y){
    	grid[y][x] = STATE.CIRCLE;
    }

    // Sets a Cross in the grid point (x,y)
    public void setCross(int x, int y){
    	grid[y][x] = STATE.CROSS;
    }

    // Sets Blank in the grid point (x,y)
    public void setBlank(int x, int y){
    	grid[y][x] = STATE.BLANK;
    }

    // Returns true if grid point(x,y) is a Circle
    public boolean isCircle(int x, int y){
    	return grid[y][x]  == STATE.CIRCLE;
    }

    // Returns true if grid point(x,y) is a Cross
    public boolean isCross(int x, int y){
        return grid[y][x]  == STATE.CROSS;
    }

    // Returns true if grid point(x,y) is Blank
    public boolean isBlank(int x, int y){
        return grid[y][x]  == STATE.BLANK;
    }

    // Sets the winner of the current game to specific state
    public void setWinner(STATE s){
    	winner = s;
    }

    // Returns true if the winner is a specific state
    public boolean isWinner(STATE s){
    	return winner == s;
    }

    // Restarts the game by cleaning the grid and resets the winner
    public void cleanGrid(){
    	for (int y = 0; y < grid.length; y++) {
            for (int x = 0; x < grid[y].length; x++) {
                grid[y][x] = STATE.BLANK;
            }
        }

        winner = STATE.BLANK;
    }

    // Returns true if  the game grid is all blank and no winner specified
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

    // Returns true if  there is any Cross or Circle three in a row on the grid
    public boolean isThreeInRow(STATE player){
	for(int x = 0; x < grid.length; x++){
		STATE first = grid[0][x];
		STATE second = grid[1][x];
		STATE third = grid[2][x];
		if(first == second && second == third){
			if(third == player){
        			setWinner(player);
				return true;
			}
                }
	}
	for(int y = 0; y < grid.length; y++){
		STATE first = grid[y][0];
		STATE second = grid[y][1];
		STATE third = grid[y][2];
		if(first == second && second == third){
                        if(third == player){
                                setWinner(player);
				return true;
                        }
                }
	}
	STATE leftup = grid[2][0];
	STATE leftdown = grid[0][0];
	STATE mid = grid[1][1];
	STATE rightup = grid[2][2];
	STATE rightdown = grid[0][2];
	if(leftup == mid && mid == rightdown){
        	if(mid == player){
			setWinner(player);
                	return true;
                }
	}
	if(rightup == mid && mid == leftdown){
		if(mid == player){
			setWinner(player);
                        return true;
                }
	}
	return false;
    }
    
    // Returns true if there is any Blank state on the game grid
    public boolean isAnyFreeSpotLeft(){
	for(int x = 0; x < grid.length; x++){
		for(int y = 0; y < grid.length; y++){
			if(grid[y][x] == STATE.BLANK){
				return true;
			}
		}
	}
	return false;
    }

    public static void main(String[] args){
                TicTacToe game = new TicTacToe();
    }

    // Game is ran, goes a round as long as there is a free space and no winner yet. 
    public void playGame(){
                while(isAnyFreeSpotLeft() && !isWinner(STATE.CIRCLE) && !isWinner(STATE.CROSS)){
                        moveplayer("cross");
                        isThreeInRow(STATE.CROSS);
                        if(!isWinner(STATE.CROSS)){
                                moveplayer("circle");
                                isThreeInRow(STATE.CIRCLE);
                        }
			else{
				System.out.println("The player with the CROSS is the winner!");
			}
                }
		if(isWinner(STATE.CIRCLE)){
			System.out.println("The player with the CIRCLE is the winner!");
		}
        }
   
    // Gets the x,y coordinates the player wants his mark on
    private void moveplayer(String l){
                Scanner in = new Scanner(System.in);
			int x = -1;
			int y = -1;
			while(x < 0 || !isBlank(x,y)){
                        	x = in.nextInt();
                        	y = in.nextInt();
				if(!isBlank(x,y)){
					System.out.println("This one is taken, please try again!");
				}
			}
                        if(l == "cross"){	
                                setCross(x,y);
                        }
                        else{				
                                setCircle(x,y);
                        }

        }
			
}			

