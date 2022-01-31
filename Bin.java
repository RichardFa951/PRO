package com.company;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ake cislo chcete hľadať:");
        int cislo = sc.nextInt();

        int velkostPola =5;
        int[] arr = new int[velkostPola];
        for (int i = 0; i < velkostPola; i++)
        {
            arr[i] =(int)(Math.random()*9+1);
            System.out.print(arr[i]+ " ");

        }

        int f = 0;
        int l =velkostPola-1;
        int m = (f+l)/2;

        while(f<=l)
        {
            if(arr[m]<cislo)
                f = m+1;
            else if(arr[m]==cislo)
            {
                System.out.println("\nElement is found on position:" +(m+1));
                break;
            }
            else
                l = m-1;

            m = (f+l)/2;
        }

        if(f>l)
            System.out.println("\nElement is not found!");
    }
}
