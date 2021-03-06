package edu.ithaca.dragon.games.tictactoe;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import edu.ithaca.dragon.games.tictactoe.player.BrainDeadPlayer;
import edu.ithaca.dragon.games.tictactoe.player.RuleBasedAgentBradley;

public class TicTacToeTest {

    @Test
    public void brainDeadGameTest(){
        TicTacToeGame game = new TicTacToeGame(new BrainDeadPlayer(), new BrainDeadPlayer());
        while (game.calcGameStatus() == GameStatus.PLAYING){
            game.takeTurn();
        }
        String gameResult = game.makeBoardCopy().buildSquaresString();
        assertTrue("XOXOXOX  ".equals(gameResult) || "OXOXOXO  ".equals(gameResult));
    }

    @Test
    public void ruleBasedGameTest(){
        TicTacToeGame game = new TicTacToeGame(new RuleBasedAgentBradley(), new RuleBasedAgentBradley());
        while (game.calcGameStatus() == GameStatus.PLAYING){
            game.takeTurn();
        }
        String gameResult = game.makeBoardCopy().buildSquaresString();
        assertTrue("XOXOXOX  ".equals(gameResult) || "OXOXOXO  ".equals(gameResult));
    }

    @Test
    public void ruleanddeadGameTest(){
        TicTacToeGame game = new TicTacToeGame(new RuleBasedAgentBradley(), new BrainDeadPlayer());
        while (game.calcGameStatus() == GameStatus.PLAYING){
            game.takeTurn();
        }
        String gameResult = game.makeBoardCopy().buildSquaresString();
        assertTrue("XOXOXOX  ".equals(gameResult) || "OXOXOXO  ".equals(gameResult));
    }
    
}
