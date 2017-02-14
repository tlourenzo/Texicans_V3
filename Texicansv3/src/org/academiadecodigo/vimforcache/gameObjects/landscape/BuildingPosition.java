package org.academiadecodigo.vimforcache.gameObjects.landscape;

/**
 * Created by tlourenzo on 11-02-2017.
 */
public enum BuildingPosition {
    B1(85, 80, 200, 100),
    B2(80, 255, 210, 170),
    B3(80, 495, 210, 170),
    B4(350, 75, 110, 170),
    B5(350, 315, 110, 350),
    B6(530, 75, 110, 50),
    B7(530, 195, 110, 50),
    B8(530, 315, 110, 110),
    B9(530, 495, 110, 170),
    B10(714, 77, 230, 50),
    B11(714, 195, 230, 50),
    B12(710, 315, 230, 110),
    B13(710, 495, 110, 170),
    B14(893, 492, 50, 170),
    B15(1010, 75, 210, 170),
    B16(1010, 315, 210, 110),
    B17(1012, 495, 210, 170);


    private int x;
    private int y;
    private int width;
    private int height;

    BuildingPosition(int x, int y, int width, int heigth) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = heigth;

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}

