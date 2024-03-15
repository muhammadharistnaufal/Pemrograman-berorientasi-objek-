/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionFive;

/**
 *
 * @author marse
 */
import java.util.Scanner;

public class HitungBangunDatar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("01. Bujur Sangkar");
        System.out.println("02. Persegi Panjang");
        System.out.println("--- Isikan Pilihan---");

        int pilihan = sc.nextInt();
        if (pilihan == 1) {
            System.out.println("\n Masukan Nilai Sisi :");
            int s = sc.nextInt();

            BujurSangkar bs = new BujurSangkar(s);
            System.out.println(bs);

        } else if (pilihan == 2) {
            System.out.println("\n Masukan Nilai Panjang :");
            int p = sc.nextInt();
            System.out.println("\n Masukan Nilai Lebar :");
            int l = sc.nextInt();
            
            PersegiPanjang ps = new PersegiPanjang(p, l);
            System.out.println(ps);
        }
    }
}
