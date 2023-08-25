package com.pasim.aplication;

import java.util.Scanner;

public class PaternAplication {
    public static void main(String[] args) {

     int pilih,sisi,panjang,lebar,tinggi,alas;
      Scanner input=new Scanner(System.in);

    System.out.println("1.Pesegi");
    System.out.println("2.Pesegi Panjang");
    System.out.println("3.Trapesium");
    System.out.println("4.Segitiga");
    System.out.println("5.Jajar Genjang1");
    System.out.println("Pilih:");   
    pilih=input.nextInt();
   
    if(pilih==1){
        System.out.println("masukkan sisi:");
        sisi = input.nextInt();
        Persegi(sisi);
      }else if(pilih==2){
        System.out.println("masukkan panjang:");
        panjang  = input.nextInt();
        System.out.println("masukkan lebar:");
        lebar=input.nextInt();
        PesegiPanjang(panjang, lebar);
      }else if(pilih==3){
        System.out.println("masukkan alas:");
        alas=input.nextInt();
        System.out.println("masukkan tinggi");
        tinggi=input.nextInt();
        Trapesium(alas, tinggi);
      }else if(pilih==4){
        System.out.println("masukkan alas:");
        alas=input.nextInt();
        System.out.println("masukkan tinggi:");
        tinggi=input.nextInt();
        Segitiga(alas, tinggi);
      }else if(pilih==5){
        System.out.println("masukkna alas:");
        alas=input.nextInt();
        System.out.println("masukkna tinggi");
        tinggi=input.nextInt();
        JajarGenjang(alas, tinggi);

      }else{
        System.out.println("Pilihan tidak adaaa");
      }


   
    }

    static void Persegi(int sisi){
            int jumlah= sisi*sisi;
            for(int a=0;a<sisi;a++){
                for (int i=0 ;i<sisi;i++) {
                    System.out.print("* ");
                }System.out.println(" ");
            }
            System.out.println("Luas Persegi adalah :"+jumlah);
    }

    static void PesegiPanjang(int panjang,int lebar){
        int jumlah=panjang*lebar;
        for(int a=0;a<lebar;a++){
            for(int i=0;i<panjang;i++){
                System.out.print("* ");
            }System.out.println(" ");
        }System.out.println("Luas persegi panjang adalah :"+jumlah);
    }
    
    static void JajarGenjang (int alas,int tinggi){
        int jumlah=alas*tinggi;
        for(int a=0;a<tinggi;a++){
            for(int b=0;b<tinggi-a-1;b++){
                System.out.print(" ");
            }
            for(int c=0;c<alas;c++){
                System.out.print("*");
            }System.out.println(" ");
        }System.out.println("Luas Jajar genjang adalah:"+jumlah);
    }


    static void Trapesium(int alas,int tinggi){
        int rows = 4;

    for (int i = 1; i <= rows; i++) {
        for (int j = 1; j <= rows - i; j++) {
            System.out.print(" ");
        }
        for (int k = 1; k <= 2 * i - 1; k++) {
            System.out.print(" *");
        }
        System.out.println(" ");
    }
    
    }
    static void Segitiga(int alas,int tinggi){
        int jumlah=(alas*tinggi)/2;
        for(int a=0;a<tinggi;a++){
            for(int b=0;b<=a;b++){
                System.out.print("*");
            }System.out.println(" ");
        }System.out.println("Luas segitiga adalah :"+jumlah);
    }


}
