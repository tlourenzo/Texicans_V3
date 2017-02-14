package org.academiadecodigo.vimforcache.game;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimforcache.gameObjects.car.Direction;
import org.academiadecodigo.vimforcache.screens.FinalScreen;


/**
 * Created by tlourenzo on 10-02-2017.
 */
public class Representation {
    private int height;
    private int width;
    private int x;
    private int y;
    private int maxX;
    private int maxY;
    private Picture picture;
    private CollideDetector collideDetector;
    private boolean isCrashed;


// Representation for People and Van

    public Representation(int x, int y, String path) {

        this.x = x;
        this.y = y;
        picture = new Picture(x, y, path);
        width = picture.getWidth();
        height = picture.getHeight();
        picture.draw();
    }



    // Representation for Buildings constructor

    public Representation(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setColor(Color.RED);
        //rectangle.draw();

    }

    //Moves
    public void move(Direction direction) {
        if(collideDetector.getSpentGas() >0) {
            switch (direction) {
                case UP:
                    if (y > 10) {
                        collideDetector.setSpentGas();
                        picture.translate(0, -10);
                        y -= 10;
                        picture.delete();
                        picture = new Picture(picture.getX(), picture.getY(), "resources/van_up.png");
                        picture.draw();
                        collideDetector.checkCrash();
                        lostbyGas();
                        break;
                    }

                case DOWN:
                    if ((y + height) < 730) {
                        collideDetector.setSpentGas();
                        picture.translate(0, 10);
                        y += 10;
                        picture.delete();
                        picture = new Picture(picture.getX(), picture.getY(), "resources/van_down.png");
                        picture.draw();
                        collideDetector.checkCrash();
                        lostbyGas();
                        break;
                    }

                case LEFT:
                    if (x > 10) {
                        collideDetector.setSpentGas();
                        picture.translate(-10, 0);
                        x -= 10;
                        picture.delete();
                        picture = new Picture(picture.getX(), picture.getY(), "resources/van_left.png");
                        picture.draw();
                        collideDetector.checkCrash();
                        lostbyGas();
                        break;
                    }

                case RIGHT:
                    if ((x + width) < 1275) {
                        collideDetector.setSpentGas();
                        picture.translate(10, 0);
                        x += 10;
                        picture.delete();
                        picture = new Picture(picture.getX(), picture.getY(), "resources/van_right.png");
                        picture.draw();
                        collideDetector.checkCrash();
                        lostbyGas();
                        break;
                    }
            }
        }

    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getMaxX() {
        maxX = x + width;
        return maxX;
    }

    public int getMaxY() {
        maxY = y + height;
        return maxY;
    }

    public void setCollideDetector(CollideDetector collideDetector) {
        this.collideDetector = collideDetector;

    }

    public void deletePicture() {
        this.picture.delete();
    }


    //Getters para edificios
    public boolean isCrached() {
        return isCrashed;
    }

    public void setCrached() {
        isCrashed = true;
    }

    public void setNotCrached() {
        isCrashed = false;
    }

    //LoseByGas
    public void lostbyGas() {
        if (collideDetector.getSpentGas() == 0) {

            FinalScreen f = new FinalScreen();
            f.startKey();
        }
    }

}
