package com.company;

public class Main {

    public static void main(String[] args) {
//        width of 16 (2bytes)
        char myChar = '\u00A9';
        System.out.println("my unicode character was: " + myChar);

        boolean myBool = false;

        String myString = "this is a string!";
        System.out.println(myString);

        String intString = "240.343";
        String anotherIntString = "240.343";
        System.out.println(intString + anotherIntString);

        String lastString = "10";
        int myInt = 50;
        System.out.println(lastString + myInt);
    }
}
