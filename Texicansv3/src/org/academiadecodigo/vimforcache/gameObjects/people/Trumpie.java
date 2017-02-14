package org.academiadecodigo.vimforcache.gameObjects.people;

import org.academiadecodigo.vimforcache.game.Representation;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public class Trumpie extends People {

    private boolean isDead;

    public Trumpie(Representation representation) {
        super(representation);
    }

    public boolean getIsDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }
}
