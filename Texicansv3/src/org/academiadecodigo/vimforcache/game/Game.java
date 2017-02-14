package org.academiadecodigo.vimforcache.game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.vimforcache.gameObjects.GameObject;
import org.academiadecodigo.vimforcache.gameObjects.car.Van;
import org.academiadecodigo.vimforcache.gameObjects.landscape.BuildingFactory;
import org.academiadecodigo.vimforcache.gameObjects.landscape.BuildingPosition;
import org.academiadecodigo.vimforcache.gameObjects.people.*;
import org.academiadecodigo.vimforcache.util.Counter;

import java.util.ArrayList;


/**
 * Created by tlourenzo on 10-02-2017.
 */
public class Game {

    private Field field;
    public final static int PADDING = 10;
    private ArrayList<GameObject> gameObjectArray;
    private Van van;
    private CollideDetector collideDetector;
    private Sound sound;


    public void gameInit() {

        field = new Field();
        field.fieldInit();
        gameObjectArray = new ArrayList<>();
        sound = new Sound("/resources/TheATeam.wav");
        sound.setLoop(5);
        sound.play();

        for (int i = 0; i < BuildingPosition.values().length; i++) {
            BuildingFactory.createBuildings();

        }

        van = new Van(new Representation(PADDING + 30, 600, "resources/van_up.png"));


        for (int i = 0; i < TrumpiePosition.values().length; i++) {
            gameObjectArray.add(PeopleFactory.createNewTrumpie());
        }

        for (int i = 0; i < MexicanPosition.values().length; i++) {
            gameObjectArray.add(PeopleFactory.createNewMexican());
        }

        collideDetector = new CollideDetector(gameObjectArray, van);
        van.setCollideDetector(collideDetector);

    }

}