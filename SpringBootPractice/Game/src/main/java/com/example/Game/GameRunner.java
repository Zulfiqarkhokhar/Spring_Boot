package com.example.Game;

public class GameRunner {
    GameConsole game;
    public GameRunner(GameConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("RunningGame"+game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
