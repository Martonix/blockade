package sample;

import javafx.scene.paint.Paint;

import java.util.ArrayList;

public class Body {
    private double x;
    private double y;
    private double width;
    private double height;
    public static ArrayList<Body> bodies = new ArrayList<>();


    public Body(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public static void draw(){
        for(Body b : bodies){
            Controller.graphicsContext.setFill(Paint.valueOf("GREEN"));
            Controller.graphicsContext.fillRect(b.getX(), b.getY(), b.getWidth(), b.getHeight());
        }
    }

    public static void reset(){
        bodies.clear();
        Controller.player.reset();
        Controller.enemy.reset();
    }



    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
