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
}
