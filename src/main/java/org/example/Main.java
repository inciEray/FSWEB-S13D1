package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,-1));
        System.out.println("******************************");
        System.out.println(hasTeen(22,23,34));
        System.out.println("******************************");
        System.out.println(isCatPlaying(true, 10));
        System.out.println("******************************");

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if(isBarking && (clock<8 || clock >=20)){
            return true;
        }
        return false;
    }



    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        if(firstAge <= 19 && firstAge > 13 || secondAge <= 19 && secondAge > 13 ||thirdAge <= 19 && thirdAge > 13 ){
            return true;
        }
        return false;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if(isSummer){
            if(temp >= 25 && temp <= 45){
                return true;
            }
        }else{
            if(temp>=25 && temp <=35){
                return true;
            }
        }
        return false;
    }

    public static double area(double width, double height) {
        if(width <  0 || height <0){
            return -1;
        }
        return width*height;
    }

    public static double area(double radius) {
        if(radius <0)
            return -1;
        return radius * radius * Math.PI;
    }

}


