package com.game;

import java.util.Random;
//import java.util.Scanner;


//import org.springframework.boot.context.properties.BoundConfigurationProperties;

public class Game {
    private String title;
    private Integer randomNum;
    private Integer playerGuess;
    private Integer moves;
    public Game() {
        this.title= "Guess a number between 1-10";
    Random rand = new Random();
    randomNum = rand.nextInt(10)+1;
    System.out.println("Guess a Number between 1-10");
    this.moves = 1;
    //System.out.println("The random number is " + randomNum);
    /*Random move = new Random();
    playerGuess = move.nextInt();
    Scanner scanner = new Scanner(System.in);
    playerGuess = scanner.nextInt();
    if (playerGuess == randomNum) {
     System.out.println("Correct!You win");
    }
    else if (playerGuess < randomNum) {
     System.out.println("The number is higher, Guess again.");
    } else  {
     System.out.println("The number is lower, Guess again.");
    }
    scanner.close();*/
}


public String getTitle() {
    return title;
}
public void setTitle(String title) {
    this.title = title;
}
    public Integer getRandomNum() {
        return randomNum;
    }
    public void setRandomNum(Integer randomNum) {
        this.randomNum = randomNum;
    }
    public Integer getPlayerGuess() {
        return playerGuess;
    }
    public void setPlayerGuess(Integer playerGuess) {
        this.playerGuess = playerGuess;
    }
    public Integer getMoves() {
        return this.moves;
    }
    public void setMoves(Integer moves) {
        this.moves = moves;
    }
    
}
