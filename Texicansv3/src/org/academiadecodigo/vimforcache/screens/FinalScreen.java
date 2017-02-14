package org.academiadecodigo.vimforcache.screens;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimforcache.game.Game;
import org.academiadecodigo.vimforcache.game.Sound;
import org.academiadecodigo.vimforcache.gameObjects.car.Van;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 * Created by codecadet on 12/02/17.
 */

//criar metodo para home screen no game.
//Quando spacebar pressed, passa para o gameinit().
public class FinalScreen implements KeyboardHandler {

    private Picture finalScreen;
    //private Sound sound;


    public FinalScreen() {


        finalScreen = new Picture(10, 10, "resources/exitScreen.png");
        finalScreen.draw();
        //sound = new Sound(" resources/Background.wav");
        //sound.play();
    }

    public void startKey() {
        Keyboard k = new Keyboard(this);
        KeyboardEvent event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_Q);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        if (keyboardEvent.getKey() == KeyboardEvent.KEY_Q) {
            System.exit(1);
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {


    }
}
