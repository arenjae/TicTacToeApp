# TicTacToe Android App
Clean Tic Tac Toe Android App Utilizing a Neural Network

Link To Website: http://arenjae.com/TicTacToe/

---

### Table of Contents
 - [Idea](##Idea)
 - [Build](##build)
 - [Usage](#usage)
 - [Contributing](#contributing)
 - [License](##license)
 
---

##Idea
The idea behind this project was to better learn Java, XML, CSS, Ai, Neural Networks, and Android App development.
So far, there are these game modes:
  * Player vs Player
  * Player vs CPU (includes minimax algorithm)

And later when I finish the Neural Network I will add:
  * Player vs Neural Net
  * Neural Net vs CPU


In Progess:
Currently I am working on adding a neural network to play against the player/cpu.
I will be using a library initially, and then once I have a working prototype, I will
write my own neural network.

##Usage
Two game modes are currently available - Player vs Player and Player vs CPU.
There are 4 difficulty settings for Player vs CPU:
 * Easy
 * Normal
 * Hard
 * Impossible
 
Impossible uses the minimax algorithm to compute the tree of perfect moves. 



##Build
This app uses android sdk 23 as the minimum build. Please ensure that the android SDK is properly installed.
To build this app using Android Studio, start a new project, and add the files from 
```
app/src/main/java/com/arenjae/tictactoe
```
This requires Java 1.8 (lambda expressions) to be enabled.

##Contributing
To contribute, simply fork and then create a pull request. 

##License
#####Copyright (c) 2016 Rachael Johnson
This code is available under the "MIT License".
Please see the file LICENSE in this distribution for license terms.
