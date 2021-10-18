package com.codegym;

public class Cylinder {
    public static double getPerimeter (int radius) {
        return 2 * Math.PI  * radius;
    }
    public static double getBaseArea (int radius) {
        return Math.PI * radius * radius;
    }
    public static double getVolume(int radius, int height){
        return getPerimeter(radius) * height + 2 * getBaseArea(radius);
    }

    public static void main(String[] args) {
        System.out.println(getVolume(2, 5));
    }
}
