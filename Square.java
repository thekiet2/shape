package org.example;

public class Square extends Rectangle {
    private double side;
    public Square() {

    }
    public Square(double side) {
        this.side = side;
        super.setWidth(side);
        super.setLength(side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
        this.width = side;
        this.length = side;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public void setWidth(double width) {
        setSide(width);
    }
    public void setLength(double length) {
        setLength(side);
    }
    public String toString() {
        return "Square[side=" + side + ",color=" + color + ",filled=" + filled + "]";
    }
}
