/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul1;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10
 */
public class nomer8 {
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    System.out.print("Masukan Nilai TPA : ");
    int TPA = masukan.nextInt();
    System.out.print("Masukan Nilai Bahasa Inggris : ");
    int BahasaInggris = masukan.nextInt();
    if ((TPA >= 85) && (BahasaInggris >= 80))
        System.out.println("Siswa dapat Beasiswa");
    else
        System.out.println("Siswa tidak dapat Beasiswa");
    }
}
