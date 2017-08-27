package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 " + result);

        previousResult = result;

        result = result * 10;
        System.out.println(previousResult + " * 10 " + result);

        previousResult = result;

        result = result / 5;
        System.out.println(previousResult + " / 5 " + result);

        previousResult = result;
        result = result % 3;

        result++;
        result--;
        result += 2;
        result *= 10;
        result -= 10;
        result /= 10;

        boolean isAlien = false;
        if (!isAlien)
            System.out.println("It is not an Alien");

//        ==, != comparing equality
//        <,>,<=,>= all the same as everywhere else...
//        &&, || and/or

//        turnary
        boolean isCar = false;
//        if (isCar == true) wasCar = true else wasCar = false
        boolean wasCar = isCar ? true : false;


    }
}
