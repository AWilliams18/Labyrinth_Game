package edu.up.cs301.game.actionMsg;

import edu.up.cs301.game.GamePlayer;
/**
 * @author Ben Rumptz
 * @version 11/1/15
 */
public class MovePlayerGameAction extends GameAction {

    // to satisfy the Serializable interface
    private static final long serialVersionUID = 142578640L;

    private int xLoc;
    private int yLoc;


    public MovePlayerGameAction(GamePlayer p, int x, int y){
        super(p);
        xLoc = x;
        yLoc = y;
    }

    public int getX(){ return xLoc; }
    public int getY(){ return yLoc; }
}
