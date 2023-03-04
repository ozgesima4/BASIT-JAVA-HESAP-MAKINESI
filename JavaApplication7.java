
package javaapplication7;

import java.util.Scanner;

public class JavaApplication7 {

    public static void main(String[] args) {
        int secim; double sayi1,sayi2;
        Scanner input= new Scanner(System.in);
        
         
        System.out.println("islem yapilacak sayilari sirasiyla girin:");
        sayi1=input.nextInt();
        sayi2=input.nextInt();
        
        System.out.println("1)carpma islemi");
        System.out.println("2) bolme islemi");
        System.out.println("3) toplama islemi");
        System.out.println("4)cikarma islemi");
        secim=input.nextInt();
       
        
        switch (secim) {
            case 1:
                System.out.println("cevap: "+ sayi1*sayi2);
                break;
            case 2: 
                System.out.println("cevap:"+ sayi1/sayi2);
                break;
            case 3:
                System.out.println("cevap: "+(sayi1+sayi2));
                break;
            case 4: System.out.println("cevap:"+(sayi1-sayi2));
            break;
            default:
                System.out.println("uygun kriterdeki secim sayisi secilmedi.");
        }
    }
    
}
