package is.ru.TicTacToe;

import java.util.Scanner;
import is.ru.TicTacToe.TicTacToe;
import is.ru.TicTacToe.TicTacToe.STATE;


public class TicTacToeMain {

public static TicTacToe game;

 static void main(String[] args){
                game = new TicTacToe();

    }

    // Game is ran, goes a round as long as there is a free space and no winner yet. 
 public void playGame(){
                while(game.isAnyFreeSpotLeft() && !game.isWinner(STATE.CIRCLE) && !game.isWinner(STATE.CROSS)){
                        moveplayer("cross");
                        game.isThreeInRow(STATE.CROSS);
                        if(!game.isWinner(STATE.CROSS)){
                                moveplayer("circle");
                               game.isThreeInRow(STATE.CIRCLE);
                        }
                        else{
                                System.out.println("The player with the CROSS is the winner!");
                        }
                }
                if(game.isWinner(STATE.CIRCLE)){
                        System.out.println("The player with the CIRCLE is the winner!");
                }
        }
 private void moveplayer(String l){
                Scanner in = new Scanner(System.in);
                        int x = -1;
                        int y = -1;
                        while(x < 0 || !game.isBlank(x,y)){
                                x = in.nextInt();
                                y = in.nextInt();
                                if(!game.isBlank(x,y)){
                                        System.out.println("This one is taken, please try again!");
                                }
                        }
                        if(l == "cross"){
                                game.setCross(x,y);
                        }
                        else{
                                game.setCircle(x,y);
                        }

        }

}

