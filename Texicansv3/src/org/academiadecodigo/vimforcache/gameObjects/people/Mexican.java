package org.academiadecodigo.vimforcache.gameObjects.people;

import org.academiadecodigo.vimforcache.game.Representation;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public class Mexican extends People {

    private boolean isCatched;

    public Mexican(Representation representation) {
        super(representation);

    }

    public void setIsCatched(boolean bool) {
        isCatched = bool;
    }

    public boolean getisCatched() {
        return isCatched;
    }
}
