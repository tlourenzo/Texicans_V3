package org.academiadecodigo.vimforcache.gameObjects.people;

/**
 * Created by tlourenzo on 12-02-2017.
 */
public enum TrumpiePosition {
    T1(30, 70, "resources/Trumpies.png"),
    T2(30, 30, "resources/Trumpies.png"),
    T3(160, 30, "resources/Trumpies.png"),
    T4(340, 30, "resources/Trumpies.png"),
    T5(580, 20, "resources/Trumpies.png"),
    T6(880, 15, "resources/Trumpies.png"),
    T7(1230, 190, "resources/Trumpies.png"),
    T8(30, 180, "resources/Trumpies.png"),
    T9(30, 300, "resources/Trumpies.png"),
    T10(30, 420, "resources/Trumpies.png"),
    T11(190, 190, "resources/Trumpies.png"),
    T12(580, 135, "resources/Trumpies.png"),
    T13(580, 260, "resources/Trumpies.png"),
    T14(580, 440, "resources/Trumpies.png"),
    T15(710, 150, "resources/Trumpies.png"),
    T16(1215, 665, "resources/Trumpies.png"),
    T17(835, 540, "resources/Trumpies.png"),
    T18(955, 540, "resources/Trumpies.png"),
    T19(660, 545, "resources/Trumpies.png"),
    T20(1060, 250, "resources/Trumpies.png");

    private int x;
    private int y;
    private final String path;

    TrumpiePosition(int x, int y, String path) {
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
