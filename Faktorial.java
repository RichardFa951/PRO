package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Zadajte cislo:");
        int a = myScanner.nextInt();

        if(a>15){
            System.out.println("Zadali ste vysoke cislo skuste pod 15");
            System.exit(0);
        }
        int i=1;
        int faktorial=1;


        for (i =1; i<=a; i++) {

    faktorial = faktorial*i;
        }

        System.out.println("Faktorial cisla "+a+" " +"je: " +faktorial);
}

}

