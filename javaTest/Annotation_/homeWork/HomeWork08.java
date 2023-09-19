package com.javaTest.Annotation_.homeWork;

public class HomeWork08 {
    public static void main(String[] args) {

    }
}
interface IColor{
    public void show();
}
enum Color implements IColor{
    RED(255,0,0),BLUE(0,0,255),
    BLACK(0,0,0),YELLOW(255,255,0),
    GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;


    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    public int getRedValue() {
        return redValue;
    }

    public int getGreenValue() {
        return greenValue;
    }

    public int getBlueValue() {
        return blueValue;
    }

    @Override
    public String toString() {
        return "Color{" +
                "redValue=" + redValue +
                ", greenValue=" + greenValue +
                ", blueValue=" + blueValue +
                '}';
    }

    @Override
    public void show() {
        Color[] colors = Color.;
        for(Color color: colors){
            System.out.println(color);
        }
    }
}