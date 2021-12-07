package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double c1;
        double c2;
        int operacia;

do {
    System.out.println("Operacie:1=+, 2=-, 3=*, 4=/ ");
    Scanner sc1 = new Scanner(System.in);
    System.out.print("Zadajte 1. cislo: ");
    c1 = sc1.nextDouble();
    System.out.print("Zadajte 2. cislo: ");
    c2 = sc1.nextDouble();

    Scanner sc2 = new Scanner(System.in);
    System.out.print("Zadajte operaciu: ");
    operacia = sc2.nextInt();

    if (operacia==1)
    {
        System.out.println("Vysledok scitavania je: " + (c1 + c2));
    }

     else if  (operacia == 2)
    {
        System.out.println("Vysledok odcitavania je : " + (c1 - c2));
    }

    else if (operacia == 3)
    {
        System.out.println("Vysledok nasobenia je: " + (c1 * c2));
    }
    else if (operacia == 4)
    {
        System.out.println("Vysledok delenia je: " + (c1 / c2));
    }

    System.out.println("__________________________________");
}while(true);

    }
}
