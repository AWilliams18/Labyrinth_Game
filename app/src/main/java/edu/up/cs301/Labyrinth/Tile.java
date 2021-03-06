package edu.up.cs301.Labyrinth;

/**
 * Created by Brendan on 11/1/2015.
 */
public class Tile {
    //tile type variables
    public static int TEE = 1000;
    public static int CORNER = 1001;
    public static int LINE = 1002;

    //tile rotations
    public static int UP = 2000;
    public static int RIGHT = 2001;
    public static int DOWN = 2002;
    public static int LEFT = 2003;

    private int type;
    private int rotation;

    private boolean player1present;
    private boolean player2present;
    private boolean player3present;
    private boolean player4present;

    private Tile tileUpwards = null;
    private Tile tileDownwards = null;
    private Tile tileRightwards = null;
    private Tile tileLeftWards = null;

    private String treasure;

    //creates a new tile with default values
    public Tile() {
        type = Tile.LINE;
        rotation = Tile.UP;
        player1present = false;
        player2present = false;
        player3present = false;
        player4present = false;

        treasure = null;
    }

    //creates a new tile with passed in properties
    public Tile(int initType, int initRotation, boolean initP1, boolean initP2,
                 boolean initP3, boolean initP4, String initTreasure) {
        type = initType;
        rotation = initRotation;
        player1present = initP1;
        player2present = initP2;
        player3present = initP3;
        player4present = initP4;

        treasure = initTreasure;
    }

    //creates a copy of passed tile
    public Tile(Tile toCopy) {
        type = toCopy.type;
        rotation = toCopy.rotation;

        player1present = toCopy.player1present;
        player2present = toCopy.player2present;
        player3present = toCopy.player3present;
        player4present = toCopy.player4present;

        treasure = toCopy.treasure;
    }
}
