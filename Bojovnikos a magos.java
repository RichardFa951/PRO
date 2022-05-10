//arena
package com.company;

public class Arena {
    private Bojovnik bojovnik1;
    private Bojovnik bojovnik2;

    private Kocka kocka;

    public Arena(Bojovnik bojovnik1, Bojovnik bojovnik2, Kocka kocka){
        this.bojovnik1 = bojovnik1;
        this.bojovnik2 = bojovnik2;
        this.kocka = kocka;
    }
    private void  vykresli(){
        System.out.println("--------------Arena--------------");
        System.out.println("Zdravie bojovníkov: \n");
        System.out.printf("%s %s\n", bojovnik1, bojovnik1.grafickyZivot());
        System.out.printf("%s %s\n", bojovnik2, bojovnik2.grafickyZivot());
    }
    private void vypisPpravu(String sprava){
        System.out.println(sprava);

        try{
            Thread.sleep(1000);
        }catch(InterruptedException ex){
            System.err.println("Chyba");
        }
    }
    public void zapas(){
        System.out.println("Vitaj v arene");
        System.out.println("Dnes sa proti sebe postavia " + this.bojovnik1 + " a "+ this.bojovnik2);
        System.out.println("Zápas môže začať");

        while(bojovnik1.nazive() && bojovnik2.nazive()){
            bojovnik1.utoc(bojovnik2);
            vykresli();
            vypisPpravu(bojovnik1.vratPoslednuSpravu());
            vypisPpravu(bojovnik2.vratPoslednuSpravu());
            bojovnik2.utoc(bojovnik1);
            vypisPpravu(bojovnik1.vratPoslednuSpravu());
            vypisPpravu(bojovnik2.vratPoslednuSpravu());
            System.out.println();
        }
    }
}

//main
package com.company;

public class Main {

    public static void main(String[] args) {


    Kocka desatStennaKocka = new Kocka(10);
    Kocka sestStennaKocka = new Kocka(6);
    Kocka dvadsatPatStennaKocka = new Kocka(25);
    Bojovnik bojovník  = new Bojovnik("Hurtoš",100,40,10, desatStennaKocka);
    /*Bojovnik enemy  = new Bojovnik("Majloš",120,15,5, desatStennaKocka);*/
    Bojovnik magos = new Mag("Pecoš", 100, 90, 1, desatStennaKocka, 200, 20);
    Arena arena = new Arena(bojovník, magos, desatStennaKocka);

    arena.zapas();
    }

}
// mag
package com.company;

public class Mag extends Bojovnik {
    private int mana;
    private int maxMana;
    private int magickyUtok;

    public Mag(String meno, int zivot, int utok, int obrana, Kocka kocka, int mana, int magickyUtok) {
        super(meno, zivot, utok, obrana, kocka);
        this.mana = mana;
        this.maxMana = mana;
        this.magickyUtok = magickyUtok;
    }


    @Override
    public void utoc(Bojovnik souper) {

        // Mana není naplněna
        if (mana < maxMana) {
            mana += 10;
            if (mana > maxMana) {
                mana = maxMana;
            }
            super.utoc(souper);
        } else { // Magický útok
            int uder = magickyUtok + kocka.hod();
            nastavSpravu(String.format("%s použil magii za %s hp", meno, uder));
            souper.branSa(uder);
            mana = 0;
        }

    }
    public String grafickaMana() {
        return grafickyUkazatel(mana, maxMana);
    }

}

//bojovnik
package com.company;

public class Bojovnik { protected String meno; protected int zivot; protected int maxZivot; protected int utok; protected int obrana; protected Kocka kocka; private String sprava;

    public Bojovnik(String meno, int zivot, int utok,int obrana, Kocka kocka){
        this.meno=meno;
        this.zivot = zivot;
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



    protected String grafickyUkazatel(int aktualni, int maximalni) {
        String s = "[";
        int celkem = 20;
        double pocet = Math.round(((double)aktualni / maximalni) * celkem);
        if ((pocet == 0) && (nazive())) {
            pocet = 1;
        }
        for (int i = 0; i < pocet; i++) {
            s += "#";
        }
        s = String.format("%1$-" + (celkem + 1) + "s", s);
        s += "]";
        return s;
    }
    public String grafickyZivot() {
        return grafickyUkazatel(zivot, maxZivot);
    }
    public void branSa(int uder){
        int zranenie = uder -(obrana + kocka.hod());
        if (zranenie>0){
            zivot-= zranenie;
            sprava = this.meno + " utrpel zranenie " + zranenie + "hp";
            if(zivot<=0){
                zivot = 0;
                sprava += " zomrel";
            }else{
                sprava = this.meno + " odrazil utok a nestratil žiadne hp";
            }
        }
    }

    public void utoc (Bojovnik nepriatel){
        int uder = utok + kocka.hod();
        nastavSpravu(this.meno + " útočí s úderom za "+ uder+ "hp");
        nepriatel.branSa(uder);
    }

    protected void nastavSpravu(String sprava){
        this.sprava = sprava;
    }
    public String vratPoslednuSpravu(){
        return sprava;
    }
}

//kocka
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
