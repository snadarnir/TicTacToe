Egill Anton


Search Drive

Drive
.
Folder Path
My Drive
HUG - Hugbúnaðarfræði 2015H
NEW 
Folders and views
My Drive
Shared with me
Google Photos
Recent
Starred
Trash
3 GB of 15 GB used
Upgrade storage
.

Text
Administration Manual.md

Text
Design Report.md

Text
Development Manual.md
Get Drive for PC
All selections cleared 


## Tic-tac-toe Design Report
##### Version 1.0

##Introduction
Tic-tac-toe is Java implemented game, with focus on Test Driven Developmente. The code is loosely coupled and follow good object oriented design practices. The game is created by a group of students in Reykjavik University in the course T-303-HUGB, Hugbúnaðarfræði, 2015-3
"Software Engineering".

You can fetch the Project here:
[Main Git Repository][Git]  
[Git]: https://github.com/snadarnir/TicTacToe

##Authors

* Ari Hróbjartsson - [Git Account][GIT_Ari]
* Egill Anton Hlöðversson - [Git Account][GIT_Egill]
* Guðrún Þórey Sigurbjörnsdóttir - [Git Account][Git_Gudrun]
* Kristófer Andri Kristinsson - [Git Account][Git_Kristofer]
* María Builien Jónsdóttir - [Git Account][Git_Maria]

[Git_Ari]: https://github.com/arih11
[Git_Egill]:https://github.com/egillanton
[Git_Gudrun]:https://github.com/gudtsig
[Git_Kristofer]:https://github.com/kristoferandrik 
[Git_Maria]: https://github.com/mariabuilien

## Phase 1. Requirement
We started of this project by listing all the minimal requirement list:

* 2 Users should be able to play versus each other in Ubuntu 14.04.2 Linux  command console.

## Phase 2. Design
Our focus is on test driven development (TDD). Our code should  loosely coupled and follow good object oriented design practices.
Therefor we want to make unit tests for every function in our code to see if it runs as expected.
 We want to be able to build our code and make an executable .jar file in the root directory.
We will use Git as our version control system and use Gradle as our build automation system for integration test. Beside we will use Travis CI for distributed continuous integration.
To make everything compile-able we want to ensure to have build scripts. 

For Git we will use feature branches and pull request for all features.
