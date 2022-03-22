//Main
package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Location castle = new Location("Hrad", "Stojíš před okovanou branou gotického hradu, která je zřejmě jediným vchodem do pevnosti. \n" +
            "           \"Klíčová dírka je pokryta pavučinami, což vzbuzuje dojem, že je budova opuštěná.");

    Location forest = new Location("Les", "Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
            "           slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");


    Location forestPath = new Location("Lesni rozcesti", " Nacházíš se na lesním rozcestí.");

    Location forest2 = new Location("Les", "   Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
            "    slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.\n");
    Location oak = new Location("Rybník", "   Došel jsi ke břehu malého rybníka. Hladina je v bezvětří jako zrcadlo. Kousek\n" +
            "    od tebe je dřevěná plošina se stavidlem.");
    Location forest3 = new Location("Les", "    Jsi na lesní cestě, která se klikatí až za obzor, kde mizí v siluetě zapadajícího\n" +
            "    slunce. Ticho podvečerního lesa občas přeruší zpěv posledních ptáků.");

    Location house = new Location("Dom", "    Stojíš před svým rodným domem, cítíš vůni čerstvě nasekaného dřeva, která se line\n" +
            "    z hromady vedle vstupních dveří.");


        castle.setRight(forest);
        forest.setLeft(castle);
        forest.setRight(forest);


        castle.getDescription();


}
}



//Class
package com.company;

public class Location {
    private String name;
    private String description;
    private Location up;
    private Location down;
    private Location left;
    private Location right;


    public Location(String name, String description){
        this.name = name;
        this.description = description;
    }
    public Location getUp(){
        return up;
    }
    public void setUp(Location up){
        this.up=up;
    }

    public Location getDown() {
        return down;
    }

    public void setDown(Location down) {
        this.down = down;
    }

    public Location getLeft() {
        return left;
    }
    public void setLeft(Location left) {
        this.left = left;
    }

    public Location getRight() {
        return right;
    }

    public void setRight(Location right) {
        this.right = right;
    }

    public void getDescription(){
        System.out.println("Nachádzaš sa v lokacií: " + this.name);
        System.out.println("Popis lokácie: " + this.description);
        System.out.println("Môžeš ísť na: ");

        if(this.getDown() != null){
            System.out.println("Juh"+this.getDown().name);}
        if(this.getUp() != null){
            System.out.println("Sever"+this.getUp().name);}
        if(this.getRight() != null){
            System.out.println("Vychod"+this.getRight().name);}
        if(this.getLeft() != null){
            System.out.println("Zapad"+this.getLeft().name);}
        System.out.println("-----------------------------------");

    }

}
