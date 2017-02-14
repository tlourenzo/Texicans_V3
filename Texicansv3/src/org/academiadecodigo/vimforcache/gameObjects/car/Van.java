package org.academiadecodigo.vimforcache.gameObjects.car;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.vimforcache.game.CollideDetector;
import org.academiadecodigo.vimforcache.game.Representation;
import org.academiadecodigo.vimforcache.gameObjects.GameObject;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public class Van extends GameObject implements KeyboardHandler {


    public Van(Representation representation) {

        super(representation);

        Keyboard kDown = new Keyboard(this);
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_DOWN);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kDown.addEventListener(event);


        Keyboard kUp = new Keyboard(this);
        KeyboardEvent event1 = new KeyboardEvent();
        event1.setKey(KeyboardEvent.KEY_UP);
        event1.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kUp.addEventListener(event1);


        Keyboard kLeft = new Keyboard(this);
        KeyboardEvent event2 = new KeyboardEvent();
        event2.setKey(KeyboardEvent.KEY_LEFT);
        event2.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kLeft.addEventListener(event2);


        Keyboard kRight = new Keyboard(this);
        KeyboardEvent event3 = new KeyboardEvent();
        event3.setKey(KeyboardEvent.KEY_RIGHT);
        event3.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        kRight.addEventListener(event3);

    }

    public void setCollideDetector(CollideDetector collideDetector) {
        getRepresentation().setCollideDetector(collideDetector);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_DOWN:
                this.getRepresentation().move(Direction.DOWN);
                break;

            case KeyboardEvent.KEY_UP:
                this.getRepresentation().move(Direction.UP);
                break;

            case KeyboardEvent.KEY_RIGHT:
                this.getRepresentation().move(Direction.RIGHT);
                break;

            case KeyboardEvent.KEY_LEFT:
                this.getRepresentation().move(Direction.LEFT);
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {
        this.getRepresentation().setNotCrached();
    }


}
