package SelfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class ArmstrongNumber_1 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi=scan.nextInt();
        int toplam=0;
        int carpimKatsayisi=1;
        String str=""+sayi;
        int bs=str.length();

        int arr[]=new int[bs];

        System.out.println("\nGirilen sayi "+bs+" basamaklidir");
        for(int i=0; i<bs; i++) {
            arr[i]=Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println("\nSayinin basamak degerleri "+ Arrays.toString(arr)+" dir.");

        for(int i=0;i<bs;i++) {
            for(int j=0;j<bs;j++) {
                carpimKatsayisi*=arr[i];
            }
            toplam+=carpimKatsayisi;
            carpimKatsayisi=1;
        }
        System.out.println("\nSayi basamaklarinin "+bs+". kuvvetleri toplami "+toplam);

        if(sayi==toplam) {
            System.out.println("\nGirdiginiz sayi : "+sayi+"   Armstrong Numberdir.");
        }else {
            System.out.println("\nGirdiginiz sayi : "+sayi+"   Armstrong Number degildir.");
        }
        scan.close();

    }
}
