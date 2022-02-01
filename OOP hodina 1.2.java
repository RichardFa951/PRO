package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        ahoj z = new ahoj();
        z.text = "Ahoj uzivateľ";
        z.pozdrav("Risiek");
        z.pozdrav("Krtek");

        z.text = "Vitaj";
        z.pozdrav("Tomáš");

        System.out.println("--------------------------");
        ahoj c = new ahoj();
        c.text = "Viaj ako sa máš";
        c.pozdrav("Guma");

        System.out.println("--------------------------");
        z.pozdrav("Julia");
        c.pozdrav("Julia");

        System.out.println("--------------------------");
        ahoj y = new ahoj();
        y.text = "Aké je dnes počasie";
        y.pozdrav("Ivan");
      --------------------------------------
      
      package com.company;

public class ahoj {
    public String text;

    public void pozdrav(String meno) {
        System.out.println(text + " " + meno);

    }
}

       ------------------------------------------------------------------------------------------------------------------------
      
        Kalkulacka kalkulacka = new Kalkulacka();
        Scanner sc = new Scanner(System.in);
        System.out.println("zadaj a:");
        kalkulacka.a = sc.nextInt();
        System.out.println("zadaj b:");
        kalkulacka.b = sc.nextInt();
        kalkulacka.scitaj();
        int vysledok = kalkulacka.odcitaj();
        System.out.println("Rozdiel:" + vysledok);
        System.out.println("Sučin:" + kalkulacka.vynasob());
        System.out.println("Podiel " + kalkulacka.vydel());
      
        --------------------------------------
      
      package com.company;

public class Kalkulacka {
    public int a;
    public int b;


    public void scitaj(){
        int vysledok = a+b;
        System.out.println("Sučet:" + vysledok);
    }
    public int odcitaj(){
        int vysledok = a-b;
        return vysledok;
    }
    public int vynasob(){
        return a*b;

    }
    public double vydel(){
        if(b== 0 ){
            System.out.println("Nulou sa deliť nedá");
            return 0;
        }
        return  (double)a/ (double) b;
    }
}


    }
}
