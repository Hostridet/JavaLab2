package com.company;

public class Main {

    public static void main(String[] args) {
	ClimbInfo Climb = new ClimbInfo("Green", 23);
    System.out.println(Climb.getName());
    System.out.println(Climb.getTime());
    ClimbInfo ClimbSecond = new ClimbInfo("YellowStone",  62);
    System.out.println(ClimbSecond.getName());
    System.out.println(ClimbSecond.getTime());
    }
}
