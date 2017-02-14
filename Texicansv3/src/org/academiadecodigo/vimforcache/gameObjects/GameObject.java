package org.academiadecodigo.vimforcache.gameObjects;

import org.academiadecodigo.vimforcache.game.Representation;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public abstract class GameObject {

    private Representation representation;

    public GameObject(Representation representation) {
        this.representation = representation;
    }

    public Representation getRepresentation() {
        return representation;
    }

}