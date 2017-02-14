package org.academiadecodigo.vimforcache;

import org.academiadecodigo.vimforcache.screens.InitialScreen;

/**
 * Created by tlourenzo on 10-02-2017.
 */
public class Main {

    public static void main(String[] args) {

        InitialScreen initialScreen = new InitialScreen(10, 10, "resources/initScreen.png");
        initialScreen.startKey();

    }
}
