package edu.up.cs301.Labyrinth;

import edu.up.cs301.game.infoMsg.GameState;

/**
 * Created by Brendan on 11/1/2015.
 */
public class LabyrinthGameState extends GameState {
    private int currentPlayer;
    private Tile[][] gameTiles;
    private Tile extraTile;
    private String[] player1Targets;
    private String[] player2Targets;
    private String[] player3Targets;
    private String[] player4Targets;

    //creates a new gameState
    public LabyrinthGameState () {
        currentPlayer = 0;
        gameTiles = new Tile[7][7];
        extraTile = new Tile();
        player1Targets = new String[4];
        player2Targets = new String[4];
        player3Targets = new String[4];
        player4Targets = new String[4];
    }

    public LabyrinthGameState (LabyrinthGameState toCopy) {
        currentPlayer = toCopy.currentPlayer;

    }
}
