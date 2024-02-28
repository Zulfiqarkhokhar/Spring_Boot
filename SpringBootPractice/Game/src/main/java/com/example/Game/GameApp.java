package com.example.Game;

public class GameApp {
    public static void main(String[] args){
        var marioGame = new MarioGame();
        var superContra = new SuperContraGame();
        var gameRunner = new GameRunner(superContra);
        gameRunner.run();
    }
}
