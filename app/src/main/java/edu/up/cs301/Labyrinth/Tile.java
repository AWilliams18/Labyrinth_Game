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

    private Tile tileupwards;
    private Tile tileDownwards;
    private Tile tileRightwards;
    private Tile likeLeftWards;

    private String treasure;
}
