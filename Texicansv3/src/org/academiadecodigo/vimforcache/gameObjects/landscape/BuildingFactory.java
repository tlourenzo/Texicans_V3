package org.academiadecodigo.vimforcache.gameObjects.landscape;

import org.academiadecodigo.vimforcache.game.Representation;

/**
 * Created by tlourenzo on 11-02-2017.
 */
public class BuildingFactory {

    private static int count;

    public static LandScape createBuildings() {

        BuildingPosition b = BuildingPosition.values()[count];
        count++;

        return new Building(new Representation(b.getX(), b.getY(), b.getWidth(), b.getHeight()));

    }
}
