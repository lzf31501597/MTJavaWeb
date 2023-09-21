package com.javaTest.Annotation_.homeWork;

public class HomeWork08 {
    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color color: colors) {
            color.show();
            switch (color){
                case RED:
                    System.out.println("RED(255,0,0)");
                    break;
                case BLUE:
                    System.out.println("BLUE(0,0,255)");
                    break;
                case BLACK:
                    System.out.println("BLACK(0,0,0)");
                    break;
                case YELLOW:
                    System.out.println("YELLOW(255,255,0)");
                    break;
                case GREEN:
                    System.out.println("GREEN(0,255,0)");
                    break;
            }
        }
        //System.out.println(Color.show());

        for(Color colorr: colors){
            switch (colorr){
                case RED:
                    System.out.println("RED(255,0,0)");
                    break;
                case BLUE:
                    System.out.println("BLUE(0,0,255)");
                    break;
                case BLACK:
                    System.out.println("BLACK(0,0,0)");
                    break;
                case YELLOW:
                    System.out.println("YELLOW(255,255,0)");
                    break;
                case GREEN:
                    System.out.println("GREEN(0,255,0)");
                    break;
            }


        }
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

    private Color() {
    }

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
        System.out.println("三色值：" + redValue + " ," + greenValue + " ," + blueValue);

    }
}