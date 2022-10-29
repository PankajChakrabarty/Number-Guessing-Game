package com.game;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyGameController {

    private Player p = new Player();

    // POST /player
    @PostMapping("/player")
    public void postName(@RequestParam String name) {
        p.setName(name);
    }

    // GET /player

    @GetMapping("/player")
    public Player getPlayer() {
        return p;

    }
    /* @GetMapping("/player")
    public Player getPlayer(@RequestParam String player) {
        if (p.getPlayer() == player) {
            return p;
        } else {
            return null;
        }
    } */
    //put player
    /*@PutMapping("/player")
    public void putGamesPlayed(@RequestParam Integer gamesPlayed) {
        p.setGamesPlayed(gamesPlayed);
    }*/

    private Game g = new Game();
    
     // POST /game
     @PostMapping("/game")
     public String postGame() {
        return g.getTitle();
     }

      // GET /game
    @GetMapping("/game")
    public Game getGame() {
        return g;
    }

    //PUT Player Guess
    /*  @PutMapping("/game")
    public void putPlayerGuess(@RequestParam Integer playerGuess) {
        g.setPlayerGuess(playerGuess);
    } */
    
    @PutMapping("/game")
    public void putPlayerGuess(@RequestParam Integer playerGuess) {
        g.setPlayerGuess(playerGuess);
        Integer totalMoves = g.getMoves();
        if (g.getPlayerGuess() > g.getRandomNum()) {
            System.out.println("The number is smaller, Guess again.");
            g.setMoves(++totalMoves);
        }
        else if (g.getPlayerGuess() < g.getRandomNum()) {
            System.out.println("The number is larger, Guess again.");
            g.setMoves(++totalMoves);
        } else  {
            String playerMoves = "";
            if( totalMoves != 0 ){
                playerMoves = "You used " + totalMoves + " moves";
            }
            System.out.println("correct! you win. " + playerMoves);
            g.setMoves(1);
        }
        g.setPlayerGuess(playerGuess);
    }


}
   

