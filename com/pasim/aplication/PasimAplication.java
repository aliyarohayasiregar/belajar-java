package com.pasim.aplication;

import java.util.Scanner;

public class PasimAplication{
    public static void main(String[] args) {
        System.out.println("haloo");
        String namaDepan,namaBelakang,nim,jurusan,fakultas;
        Float ipKomulatif;

        Float[] ipSemester=new Float[3];

        namaDepan="Aliya";
        namaBelakang="Rohaya";
        nim="1845679";
        jurusan="d3 MI";
        fakultas="ilmu komputer";

        Scanner input= new Scanner(System.in);
        System.out.print("Semester 1 :");
        ipSemester[0]=input.nextFloat(); 
        System.out.print("Semester 2 :");
        ipSemester[1]=input.nextFloat();
        System.out.print("Semester 3 :");
        ipSemester[2]=input.nextFloat();

        ipKomulatif=(ipSemester[0]+ipSemester[1]+ipSemester[2])/3;

        //percabangan if else
        if(ipKomulatif<3.35){
            System.out.println("ANda di DO!!");
        }

        //percabangan ternary operator
       System.out.println("Apakah anada betah di pub??");
       Boolean tanya=false;
       String jawab= tanya? "Alhamdulillah" : "tidakkk";




        System.out.println("Nama :"+namaDepan.concat(namaBelakang));
        System.out.println("Nim:"+nim);
        System.out.println("jurusan:"+jurusan);
        System.out.println("fakultas:"+fakultas);
        System.out.println("ipk :"+ipKomulatif);









    }
}