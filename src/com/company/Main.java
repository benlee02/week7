package com.company;

public class Main {

    public static void main(String[] args) {
        int tempF = 88;

        System.out.println("The temperature in degrees celcius is " + fahrenToCelcius(tempF));

        int tempC=34;

        System.out.println("The temperature in degrees fahrenheit is " + celcToFahren(tempC));
        System.out.println("hi");
        System.out.println("ii");
    }

    public void menu(){

    }


    static double fahrenToCelcius(int temp){
        double celcius=(temp - 32)/1.8;
        return celcius;
    }

    static double celcToFahren(int temp){
        double fahren= (temp*1.8) +32;
        return fahren;
    }
}
