package com.company;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int sucet=0;
        int priemer;
        Integer [] pole = new Integer[20];
        for(int i =0; i < pole.length; i++) {
        int random = (int)(Math.random()*50);
        pole[i] = 0+random;
            System.out.println(pole[i]);
        }
    for (int cislo : pole){
        sucet = sucet + cislo;
    }
priemer = sucet / pole.length ;

Arrays.sort(pole);
        System.out.println("sučet je:" +sucet);
        System.out.println("priemer je:" +priemer);
        System.out.println("maximlany prvok je:" +pole[19]);
        System.out.println("minimalny prvok je:" +pole[0]);
}
}