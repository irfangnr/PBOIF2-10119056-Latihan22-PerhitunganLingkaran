/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119056.latihan22.perhitunganlingkaran;

import java.util.Scanner;
/**
 * @author ACER
 * NAMA     : Irfan Ginanjar
 * KELAS    : PBOIF2
 * NIM      : 10119056
 * Deskripsi Program: Program ini berisi program untuk menampilkan perhitungan lingkaran
 */
public class PBOIF210119056Latihan22PerhitunganLingkaran {

    public static void main(String[] args) {
        double r,diameter,K,L;
        double phi=3.14;
        String a = null;
        Scanner masukan=new Scanner(System.in);
        System.out.println("====Perhitungan Lingkaran====");

        System.out.print("Masukan nilai diameter lingkaran: ");
        diameter=masukan.nextInt();

        r=diameter/2;
        L= phi*r*r;
        K=2*phi*r;
        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran= "+r+" cm");
        System.out.println("Luas lingkaran = "+L+" cm");
        System.out.println("Keliling Lingkaran = "+K+" cm");
        }
}
    