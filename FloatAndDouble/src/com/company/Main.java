package com.company;

public class Main {

    public static void main(String[] args) {
//        widht of int = 32 (4bytes)
        int myInValue = 5 / 2;
//        width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
//        width of double = (64 (8bytes))
        double myDoubleValue = 5d / 3d;
//        System.out.println("myIntValue = " + myInValue);
//        System.out.println("myFloatValue = " + myFloatValue);
//        System.out.println("myDoubleValue = " + myDoubleValue);

//      1.  convert given nymber of pouds to kilos
        float aPounds = 200f;
        double aKilos = aPounds * .45359237d;

        System.out.println(aKilos);

//        note: underscores can be used to clarify floats and doubles as well
        double pi = 3.141_592_7d;

    }
}
