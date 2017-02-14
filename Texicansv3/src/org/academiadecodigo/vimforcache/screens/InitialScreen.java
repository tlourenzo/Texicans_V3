package org.academiadecodigo.vimforcache.screens;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;
import org.academiadecodigo.vimforcache.game.Game;
import org.academiadecodigo.vimforcache.game.Sound;

/**
 * Created by codecadet on 12/02/17.
 */

//criar metodo para home screen no game.
//Quando spacebar pressed, passa para o gameinit().
public class InitialScreen implements KeyboardHandler {

    private final int x;
    private final int y;
    private Picture initialScreen;
    private String path;
    private Game game;
    private Keyboard k;
    private KeyboardEvent event;
    private Sound sound;

    public InitialScreen(int x, int y, String path) {
        this.x = x;
        this.y = y;
        this.path = path;

        initialScreen = new Picture(this.x, this.y, path);
        initialScreen.draw();
        sound = new Sound("/resources/Background.wav");
        sound.play();
    }

    public void startKey() {
        k = new Keyboard(this);
        event = new KeyboardEvent();
        event.setKey(KeyboardEvent.KEY_SPACE);
        event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        k.addEventListener(event);

    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            initialScreen.delete();
            sound.stop();
            game = new Game();
            game.gameInit();
            k.removeEventListener(event);
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }
}
