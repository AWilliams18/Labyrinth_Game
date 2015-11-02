package edu.up.cs301.game.actionMsg;

import edu.up.cs301.game.GamePlayer;
import java.io.Serializable;

/**
 * Created by Ben Rumptz on 11/1/2015.
 */
public class RotateTileGameAction extends GameAction {

    // to satisfy the Serializable interface
    private static final long serialVersionUID = 237810L;

    public RotateTileGameAction(GamePlayer p){
        super(p);
    }
}
