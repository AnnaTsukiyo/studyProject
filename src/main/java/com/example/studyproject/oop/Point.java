package com.example.studyproject.oop;

/**
 * Describe the class "color point".
 * Coordinates and color are set for a point.
 * Color is described using three components (red, green, blue).
 * Provide various methods for initializing an object with validation of values.
 * The valid range for each component is [0, 255]. Describe properties for getting the state of an object and a method for changing the color.
 * Write a program that demonstrates all the developed elements of the class.
 * The developed class should, as a rule, contain the following elements: hidden fields, constructors with and without parameters, methods, properties.
 */

class Point {
    public int xCoordinate, yCoordinate;

    public Point() {
        xCoordinate = yCoordinate = 0;
    }

    public void setPosition(int x, int y) {
        if ((x >= 0 && x <= 255) && (y >= 0 && y <= 255)) {
            xCoordinate = x;
            yCoordinate = y;
        }
    }

    static class ColorPoint extends Point {

        private byte red;
        private byte green;
        private byte blue;

        public ColorPoint() {
        }

        public ColorPoint(byte red, byte green, byte blue) {
            this.red = red;
            this.green = green;
            this.blue = blue;
        }

        public void setColor(byte r, byte g, byte b) {
            if ((r >= 0 && r <= 255) && (g >= 0 && g <= 255) && (b >= 0 && b <= 255)) {
                red = r;
                green = g;
                blue = b;
            }
        }

        public byte getRed() {
            return red;
        }

        public byte getGreen() {
            return green;
        }

        public byte getBlue() {
            return blue;
        }

        public static void main(String[] args) {
            ColorPoint colorPoint = new ColorPoint();
            colorPoint.setPosition(0, 10);
            colorPoint.setColor((byte) 0, (byte) 0, (byte) 1);
            System.out.println("Coordinates of the point are : ( " + colorPoint.xCoordinate + " , " + colorPoint.yCoordinate + ");");
            System.out.print("with a color : (" + colorPoint.getRed() + ", " + colorPoint.getGreen() + ", " + colorPoint.getBlue() + ");");
        }
    }
}
