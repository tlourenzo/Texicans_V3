package org.academiadecodigo.vimforcache.game;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimforcache.gameObjects.GameObject;
import org.academiadecodigo.vimforcache.gameObjects.car.Van;
import org.academiadecodigo.vimforcache.gameObjects.landscape.Building;
import org.academiadecodigo.vimforcache.gameObjects.landscape.BuildingPosition;
import org.academiadecodigo.vimforcache.gameObjects.people.Mexican;
import org.academiadecodigo.vimforcache.gameObjects.people.Trumpie;
import org.academiadecodigo.vimforcache.util.Counter;

import java.util.ArrayList;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public class CollideDetector {

    private Van van;
    private ArrayList<GameObject> arrayList;
    private Counter counter = new Counter();

    public CollideDetector(ArrayList<GameObject> arrayList, Van van) {
        this.arrayList = arrayList;
        this.van = van;
    }


    public boolean intersects(GameObject van, GameObject r) {


        return ((van.getRepresentation().getX() <= r.getRepresentation().getX() + 5 && r.getRepresentation().getX() + 5 <= van.getRepresentation().getMaxX() &&
                van.getRepresentation().getY() <= r.getRepresentation().getY() + 5 && r.getRepresentation().getY() + 5 <= van.getRepresentation().getMaxY())

                || (van.getRepresentation().getX() <= r.getRepresentation().getMaxX() - 5 && r.getRepresentation().getMaxX() - 5 <= van.getRepresentation().getMaxX() &&
                van.getRepresentation().getY() <= r.getRepresentation().getMaxY() - 5 && r.getRepresentation().getMaxY() - 5 <= van.getRepresentation().getMaxY()));
    }

/*    public boolean buildingIntersect(GameObject van, GameObject r) {

        return ((van.getRepresentation().getX() <= r.getRepresentation().getX() + 5 && r.getRepresentation().getX() + 5 <= van.getRepresentation().getMaxX() &&
                van.getRepresentation().getY() <= r.getRepresentation().getY() + 5 && r.getRepresentation().getY() + 5 <= van.getRepresentation().getMaxY())

                || (van.getRepresentation().getX() <= r.getRepresentation().getMaxX() - 5 && r.getRepresentation().getMaxX() - 5 <= van.getRepresentation().getMaxX() &&
                van.getRepresentation().getY() <= r.getRepresentation().getMaxY() - 5 && r.getRepresentation().getMaxY() - 5 <= van.getRepresentation().getMaxY())

                || (van.getRepresentation().getX() <= r.getRepresentation().getX() + 5 && r.getRepresentation().getX() + 5 <= van.getRepresentation().getMaxX() &&
                van.getRepresentation().getY() <= r.getRepresentation().getMaxY() + 5 && r.getRepresentation().getMaxY() + 5 <= van.getRepresentation().getMaxY())

                || van.getRepresentation().getX() <= r.getRepresentation().getMaxX() + 5 && r.getRepresentation().getMaxX() + 5 <= van.getRepresentation().getMaxX() &&
                van.getRepresentation().getY() <= r.getRepresentation().getY() + 5 && r.getRepresentation().getY() + 5 <= van.getRepresentation().getMaxY());
    }*/




    public void checkCrash() {

        Sound mexicanSound = new Sound("/resources/Arriba.wav");
        Sound trumpieSound = new Sound("/resources/Trump.wav");


        if (van.getRepresentation().getX() > 1100 && van.getRepresentation().getY() < 150) {
            setFullTank();
        }

        if (van.getRepresentation().getX() < 200 && van.getRepresentation().getY() > 520) {
            counter.setEmptyVan();
        }

        for (GameObject gameObject : arrayList) {

            if (intersects(van, gameObject) && gameObject instanceof Mexican && counter.getMexInVan() <5) {
                mexicanSound.play();
                counter.addMexicanstoVan();
                gameObject.getRepresentation().deletePicture();
                arrayList.remove(gameObject);
                break;
            }

            if (intersects(van, gameObject) && gameObject instanceof Trumpie) {
                trumpieSound.play();
                counter.addScore(1);
                Picture blood = new Picture(gameObject.getRepresentation().getX(), gameObject.getRepresentation().getY(), "resources/blood.png");
                blood.draw();
                gameObject.getRepresentation().deletePicture();
                arrayList.remove(gameObject);
                break;
            }

            //TESTE DE INTERSECT COM BUILDINGS

            if (intersects(van, gameObject) && gameObject instanceof Building) {
                //System.out.println(van.getRepresentation().isCrached());
                //van.getRepresentation().setCrached();

                System.out.println(" CRASHEDDDD");

                break;
            }
        }
    }

    public void setSpentGas() {
        counter.spendGas();
    }

    public int getSpentGas() {
        return counter.getGas();
    }

    public void setFullTank() {
        counter.setFullGas();
    }

}









