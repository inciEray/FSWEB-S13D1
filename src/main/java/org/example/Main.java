package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp(true,-1));
        System.out.println(hasTeen(22,23,34));
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

//    public static boolean isCatPlaying(boolean isSummer, int temp) {
//
//    }
//
//    public static double area(double width, double height) {
//
//    }
//
//    public static double area(double radius) {
//
//    }



}


