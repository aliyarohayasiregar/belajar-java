package com.pasim.aplication;

import java.util.Scanner;

public class Iterasi {
    public static void main(String[] args) {


    //perulangan for dan foreact
    //     for(int i=1;i<20;i+=2){
    //         System.out.println(i+"");
    //     }

    //     int[] number={1,2,3,4,5};
    //     for (int i : number) {
    //         System.out.println(i);
    //     }

    String user,password;
    Scanner input=new Scanner(System.in);
    
    // perulangan do while
    // boolean a=true;
    // do{
    //     System.out.println("user name:");
    //     user=input.nextLine();
    //     System.out.println("password:");
    //     password=input.nextLine();

    //     if(user.equals("aliya") && password.equals("080403")){
    //         a= false;
    //     }

    // }while(a);
    // System.out.println("login berhasil!!");



    // cara memanggil method
    System.out.println("masukkan sisi persegi:");
    int sisi = input.nextInt();
    System.out.println("luas persegi adalah :"+ luasPersegi(sisi));
    input.close();


    }

    //method
    static int luasPersegi(int sisi){
        return sisi*sisi;
    }

    //iterasi
   


}
