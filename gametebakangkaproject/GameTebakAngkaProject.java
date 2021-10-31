/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class GameTebakAngkaProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angkaAsli = 0 + (int)(Math.random() * 100);
        // menggunakan *101 artinya rentangan angkanya dimulai dari 0 sampai 100
        System.out.println("Hai.. nama saya Ny. Nurul, saya telah memilih sebuah bilangan bulat secara acak antara 0 s/d 100. Silakan tebak ya!!!");
        for (int i= 0;i<=100 ;i++){
            System.out.print("Masukkan Tebakan Anda: ");
            int tebakAngka = input.nextInt();
            
            if (tebakAngka < angkaAsli ){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
            }else if (tebakAngka > angkaAsli ){
                System.out.println("Hehehe… Bilangan tebakan anda terlalu Besar");
            }else {
                System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                break;
            }
        }
    }
    
}
