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




## Tic-tac-toe Administration Manual
#### Version 1.0


## 1. Introduction
Welcome to the Tic-tac-toe Administration Manual! This manual provides information on how to use the TicTacToe. The manual provides an overview how to set Tic-tac-toe up and get it to run, also on a fresh machine.
How to install and run the program on clients machine
Because much of the information in this manual is general, it contains many references to other sources where you can find more detail.

## 2. Getting the Tic-tac-toe to your machine

First you want to make sure you have git on your machine. 
[Install Git][GIT_INSTALL]
[GIT_INSTALL]: https://git-scm.com/book/en/v2/Getting-Started-Installing-Git

Second of all you want to make sure you have latest JDK or at least version 8. 
[Install JDK][JDK_INSTALL]

[JDK_INSTALL]: http://www.oracle.com/technetwork/java/javase/downloads/index.html

After making sure you have it or finish installing then you want to clone our project to your machine by using following code:

```sh
$ git clone https://github.com/snadarnir/TicTacToe.git
```
## Setup on a client computer

Now you have downloaded  our project and you are ready to build and run it. First you have to go into the project root directory.

You can now build  it by using following code:
```sh
$ sh ./bin/build_and_test
```

Then return to outside of the project root directory  and run the game by using following code:
```sh
$ java -jar TicTacToe.jar
```
