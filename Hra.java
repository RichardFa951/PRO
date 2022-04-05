//Main
package com.company;

public class Main {

    public static void main(String[] args) {


    Kocka desatStennaKocka = new Kocka(10);
    Kocka sestStennaKocka = new Kocka(6);
    Kocka dvadsatPatStennaKocka = new Kocka(25);
    Bojovnik bojovník  = new Bojovnik("Hurtoš",100,20,10, desatStennaKocka);

        System.out.println(bojovník);
        System.out.println("Žije?: " + bojovník.nazive());
        System.out.println(bojovník.grafckyZivot());
        
        /*
        System.out.println(desatStennaKocka.vratPocetStien());
        System.out.println(sestStennaKocka.vratPocetStien());


        System.out.println("DesatStenna kocka hody: ");
        for(int i =0;i<10; i++){
            System.out.print(desatStennaKocka.hod()+" ");
        }

        System.out.println();
        System.out.println("SestStenna kocka hody: ");
        for(int i =0;i<10; i++){
            System.out.print(sestStennaKocka.hod() + " ");
        }
        System.out.println();
        System.out.println("DvadsatpatStenna kocka hody: ");
        for(int i =0;i<10; i++){
            System.out.print(dvadsatPatStennaKocka.hod() + " ");
        }
        */

    }
}

//Bojovnik
package com.company;

public class Bojovnik {
    private String meno;
    private int zivot;
    private int maxZivot;
    private int utok;
    private int obrana;
    private Kocka kocka;


    public Bojovnik(String meno, int zivot, int utok,int obrana, Kocka kocka){
        this.meno=meno;
        this.zivot = zivot/5;
        this.maxZivot = zivot;
        this.utok = utok;
        this.obrana = obrana;
        this.kocka = kocka;

    }
    @Override
    public String toString(){
        return meno;
    }
    //žije hej? ne?
    public boolean nazive(){
        return (zivot>0);
    }

    public String grafckyZivot(){
        String s = "[";
        int celkom = 20;
        double pocet =Math.round((double) zivot / maxZivot * celkom);
        System.out.println(pocet);
        //ak ma min ziv 0,2 doplní ho do 1
        if(pocet == 0 && nazive()){
            pocet = 1;
        }

        for(int i = 0; i<pocet ; i++){
            s +="#";
        }

        for(int i = 0; i<celkom - pocet ; i++){
            s +=" ";
        }

        s += "]";
        return s;

    }
}

/Kocka
package com.company;
import  java.util.Random;
public class Kocka {
    private Random random;
    private int pocetStien;

    public Kocka(int pocetSten){
        pocetStien = pocetSten;
        random = new Random();
    }

    public Kocka(){
        pocetStien = 6;
        random = new Random();
    }

    public  int vratPocetStien(){
        return pocetStien;
    }
    public int hod(){
        return random.nextInt(pocetStien)+ 1;
    }

}
