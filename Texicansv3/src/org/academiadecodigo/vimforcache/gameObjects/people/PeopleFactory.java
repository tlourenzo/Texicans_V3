package org.academiadecodigo.vimforcache.gameObjects.people;

import org.academiadecodigo.vimforcache.game.Representation;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public class PeopleFactory {

    private static int count1;
    private static int count2;

    public static People createNewTrumpie() {
        TrumpiePosition trumpiePosition = TrumpiePosition.values()[count2];
        count2++;
        return new Trumpie(new Representation(trumpiePosition.getX(), trumpiePosition.getY(), trumpiePosition.getPath()));
    }

    public static People createNewMexican() {
        MexicanPosition mexicanPosition = MexicanPosition.values()[count1];
        count1++;
        return new Mexican(new Representation(mexicanPosition.getX(), mexicanPosition.getY(), mexicanPosition.getPath()));
    }
}

