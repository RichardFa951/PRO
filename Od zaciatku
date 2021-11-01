package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //priklad();
        priklad3();
    }

    static void priklad() {
        System.out.println("Zadaj polomer: ");
        Scanner myScanner = new Scanner(System.in);
        int polomer = myScanner.nextInt();
        System.out.println("Obvod kruhu je:" + 2 * Math.PI * polomer);
        System.out.println("Obsah kruhu je:" + Math.PI * polomer * polomer);
    }

    static void priklad2() {
        System.out.println("Zadaj svoj vek: ");
        Scanner myScanner = new Scanner(System.in);
        int vek = myScanner.nextInt();
        if (vek >= 18) {
            System.out.println("18+");
        } else {
            System.out.println("18-");
        }
    }

    static void priklad3() {
        System.out.println("zadajte smajlika:");
        Scanner myScanner = new Scanner(System.in);
        String smajlik = myScanner.nextLine();

        if (smajlik.equals(":-)")) {
            System.out.println("tvoj smajlik je vesely");
        } else if (smajlik.equals(":-(")) {
            System.out.println("tvoj smajlik je smutny");
        } else if (smajlik.equals(":-*")) {
            System.out.println("tvoj smajlik je zamilovany");
        } else if (smajlik.equals(":-P")) {
            System.out.println("tvoj smajlik ma vyplazeny jazyk");
        } else {
            System.out.println("tvoj smajlik je neznamy");
        }
    }
    static void priklad4(){
        System.out.println("zadajte stranu a: ");
        Scanner myScanner = new Scanner(System.in);
        double a = myScanner.nextDouble();

        System.out.println("zadajte stranu b: ");
        double b = myScanner.nextDouble();

        System.out.println("zadajte stranu c: ");
        double c = myScanner.nextDouble();

        double diskriminant = b * b - 4 * a * c;
        double koren1;
        double koren2;

        koren1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
        koren2 = (-b - Math.sqrt(diskriminant)) / (2 * a);

        if (diskriminant > 0) {
            koren1 = (-b + (float) Math.sqrt(diskriminant)) / (2 * a);
            koren2 = (-b - (float) Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("Rovnica ma dve riesenia.");
            System.out.print("x1 = " + koren2 + "\nx2 = " + koren1);}

        else if (diskriminant == 0) {
            koren1 = -b / (2 * a);
            System.out.println("Rovnica ma jedno riesenie.");
            System.out.print("x = " + koren2);}

        else {
            System.out.print("Rovnica nema riesenie");
