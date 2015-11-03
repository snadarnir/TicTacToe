# Tic-tac-toe development manual
#### Version 1.0

## 1. Introduction
Welcome to the Tic-tac-toe Development Manual! This manual provides information on how to use the TicTacToe. The manual provides an overview of the Development of the game and how to get the project to build on a fresh Linux machine . Because much of the information in this manual is general, it contains many references to other sources where you can find more detail.

## 2. Getting the Tic-tac-toe to your machine

First you want to make sure you have git on your machine. [Install Git][GIT_INSTALL]

[GIT_INSTALL]: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

After making sure you have it or finish installing then you want to clone our project to your machine by using following code:

```sh
$ git clone https://github.com/snadarnir/TicTacToe.git
```
You can now build and run it by using following code:
```sh
$ bin/build_and_test
```

## 3. Main code

You can access our main code my typing the following code:
```sh
$ cd ./src/main/java/is/ru/TicTacToe
```

There will you see two files: 

* TicTacToe
* TicTacToeMain

TicTacToe is the class file where the the implementation of the logic is implemented. The API would look like:

```java
$ public class TicTacToe {
	 public enum STATE {BLANK, CROSS, CIRCLE};
	 // Checks if the object is active
	 public boolean isActive();
	 // Sets a Circle in the grid point (x,y)
	 public void setCircle(int x, int y);
	 // Sets a Cross in the grid point (x,y)
	 public void setCross(int x, int y);
	 // Sets Blank in the grid point (x,y)
	 public void setCross(int x, int y);
	 // Returns true if grid point(x,y) is a Circle
	 public void setBlank(int x, int y);
	 // Returns true if grid point(x,y) is a Cross
	 public boolean isCircle(int x, int y);
	 // Returns true if grid point(x,y) is Blank
	 public boolean isCross(int x, int y);
	 // Returns true if grid point(x,y) is Blank
	 public boolean isBlank(int x, int y);
	 // Sets the winner of the current game to specific state
	 public void setWinner(STATE s);
	 // Returns true if the winner is a specific state
	 public boolean isWinner(STATE s);
	 // Restarts the game by cleaning the grid and resets the winner
	 public void cleanGrid();
	 // Returns true if  the game grid is all blank and no winner specified
	 public boolean isClean();
	 // Returns true if  there is any Cross or Circle three in a row on the grid
	 public boolean isThreeInRow(STATE player);
	 // Returns true if there is any Blank state on the game grid
	 public boolean isAnyFreeSpotLeft();
}
```
TicTacToeMain is the file containing the main function of our code, there is the Game ran.
Funtionality:

* Initialize game
* Runs as long as there is a free space on the game grid and yet no winner.
* Player 1 has the state Cross
* Player 2 has the state Circle
* Player 1 starts game
* Players switch turns until game is finished
* After each input, it check if player input is valid
* Announce the winner
* Game finishes 

## 4. Test Code
You can access our test code my typing the following code:
```sh
$ cd ./src/test/java/is/ru/TicTacToe
```

We use the JUnit version 4 as our unit test framework 
The most used funtion we use are:

```java
assertEquals(java.lang.Object expected, java.lang.Object actual) 
          Asserts that two objects are equal.
```

## 5. Test Environment
We use these following as our main integration test

* [Gradle 2.8] -  Our build automation system
* Travis CI -  Continuous integration service used to build and test our project hosted at GitHub

To allow gradle to build and test type:
```sh
$ $ gradle build
```

## 6. Build script

Instead of needing to type every command we have created a Build script. All of our build scripts are stored in the bin folder in the root directory.
```sh
	$ cd bin/
```

To build overall files, tests and to make a executable .jar file type:


```sh
	$ sh ./bin/build_and_test
```

After each run we want to convert our markdown to html, you can do it manually by typing: 
```sh
	$ sh ./bin/markdown_convert
```
But make sure you have markdown installed before:

```sh
	$ sudo apt-get install markdown
```
