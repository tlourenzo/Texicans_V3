package org.academiadecodigo.vimforcache.util;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Text;

/**
 * Created by codecadet on 13/02/17.
 */
public class Counter {

    private int score = 0;
    private int gas = 300;
    private int mexInVan = 0;
    private Text gasText = new Text(1105, 630, " " + getGas());
    private Text mexicanText = new Text(1105, 630, " " + getMexInVan());
    private Text trumpiesText = new Text(1105, 630, " " + getScore());


    public void addScore(int add) {
        score = score + add;
    }

    public void spendGas() {
        if(gas>0){
        gas = gas - 1;
        displayScore();}
    }


    public void setFullGas() {
        gas = 300;
    }

    public void addMexicanstoVan() {
        this.mexInVan += 1;

    }

    //Getters

    public int getGas() {

        return gas;
    }

    public int getScore() {

        return score;
    }

    public int getMexInVan() {

        return mexInVan;
    }

    public void displayScore() {
        gasText.delete();
        gasText = new Text(1105, 630, " " + getGas());
        gasText.setColor(Color.WHITE);
        gasText.draw();

        if(mexInVan < 5){
            mexicanText.delete();
            mexicanText = new Text(1105, 510, " " + getMexInVan());
            mexicanText.setColor(Color.WHITE);
            mexicanText.draw();
        }
        else{
            mexicanText.delete();
            mexicanText = new Text(1050, 510, "FULL VAN! GET TO HQ!");
            mexicanText.setColor(Color.WHITE);
            mexicanText.draw();
        }


        trumpiesText.delete();
        trumpiesText = new Text(1105, 570, " " + getScore());
        trumpiesText.setColor(Color.WHITE);
        trumpiesText.draw();

    }


    public void setEmptyVan() {
        mexInVan = 0;
    }

}
