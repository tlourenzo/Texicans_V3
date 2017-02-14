package org.academiadecodigo.vimforcache.gameObjects.people;

/**
 * Created by tlourenzo on 12-02-2017.
 */
public enum MexicanPosition {
    M1(105, 205, "resources/Texican_small.png"),
    M2(670, 150, "resources/Texican_small.png"),
    M3(670, 450, "resources/Texican_small.png"),
    M4(950, 90, "resources/Texican_small.png"),
    M5(490, 660, "resources/Texican_small.png"),
    M6(490, 270, "resources/Texican_small.png"),
    M7(670, 450, "resources/Texican_small.png"),
    M8(950, 270, "resources/Texican_small.png"),
    M9(1160, 670, "resources/Texican_small.png"),
    M10(850, 660, "resources/Texican_small.png");


    private int x;
    private int y;
    private final String path;

    MexicanPosition(int x, int y, String path) {

        this.x = x;
        this.y = y;
        this.path = path;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getPath() {
        return path;
    }
}
