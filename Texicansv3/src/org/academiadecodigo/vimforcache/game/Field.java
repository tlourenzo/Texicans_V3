package org.academiadecodigo.vimforcache.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimforcache.gameObjects.GameObject;
import org.academiadecodigo.vimforcache.gameObjects.car.Van;
import org.academiadecodigo.vimforcache.gameObjects.landscape.Building;
import org.academiadecodigo.vimforcache.gameObjects.landscape.BuildingPosition;
import org.academiadecodigo.vimforcache.gameObjects.people.Mexican;
import org.academiadecodigo.vimforcache.gameObjects.people.People;
import org.academiadecodigo.vimforcache.gameObjects.people.Trumpie;

import java.util.ArrayList;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public class Field {

    private int width;
    private int height;
    private int PADDING = 10;
    private Picture map;
    private GameObject gameObject;
    private ArrayList<GameObject> gameObjects;
    private Rectangle rectangle;


    public void fieldInit() {

        Picture map = new Picture(PADDING, PADDING, "resources/map.png");
        Rectangle rec = new Rectangle(PADDING, PADDING, map.getWidth(), map.getHeight());
        this.map = map;
        rec.draw();
        map.draw();

        Picture score = new Picture(1000, 485, "resources/score.png");
        score.draw();

    }

    public int mapGetWidth() {
        return map.getWidth();
    }

    public int mapGetHeight() {
        return map.getHeight();
    }


}
