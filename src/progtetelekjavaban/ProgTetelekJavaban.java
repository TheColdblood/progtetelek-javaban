/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progtetelekjavaban;

import java.util.Scanner;

/**
 *
 * @author SimonGergő(SZOFT_202
 */
public class ProgTetelekJavaban {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        /*Összegzés*/
        int n = 4;
        while (n < 0){
            System.out.print("N= ");
            n = sc.nextInt();
        }
        
        int ossz = 0;
        //for i in range(n+1):
        for (int i=0; i<n+1; i++){
            ossz += i;
        }
        System.out.printf("Az első %d szám összege: %d\n",n,ossz);
        
        /*Megszámlálás*/
        int db = 0;
        for (int i = 10; i<=100; i++){
            if (i % 2 == 0){
                db++;
            }
        }
        System.out.printf("Kétjegyű páros számok száma: %d.\n",db);
        
        /*Minimum*/
        final int VEGE = 0;
        db = 0;
        int min = Integer.MAX_VALUE; //2147483647
        int szam;
        System.out.println("0-ra kilép");
        while ((szam = sc.nextInt()) != VEGE){
            if (szam < min){
                min = szam;
            }
            db += 1;
        }
        System.out.printf("%d számból a legkisebb: %d",db, min);
        
        /*Eldöntés*/
        n = sc.nextInt();
        boolean prim;
        int i;
        if (n < 2){
            prim = false;
        }else{
          i = 2;
          while (i <= Math.sqrt(n) && n % i != 0){
            i += 1;
          }
          prim = i > Math.sqrt(n);
        }
        if(prim == true){
            System.out.println("Prím");
        }else{
            System.out.println("Nem prím");
        }
        
    }//main vége
    
}//class vége0
