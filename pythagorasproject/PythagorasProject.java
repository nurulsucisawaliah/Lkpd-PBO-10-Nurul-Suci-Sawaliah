/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorasproject;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class PythagorasProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //atribut 
        int menu;
        double sisiMiringSegitiga,sikuSiku;
        //objek
        Scanner input = new Scanner(System.in);
        
        System.out.println("1.Cek triple pythagoras");
        System.out.println("2.Menentukan sisi miring segitiga");
        System.out.println("3.Menentukan sisi siku-siku segitiga");
        System.out.println("4.Exit");
        
        System.out.print("silahkan memilih menunya: ");
        menu = input.nextInt();
        
        //Pilihan Menu
        switch(menu){
            case(1):
                System.out.print("a: ");
                int aNgecekPythagoras = input.nextInt();
                System.out.print("b: ");
                int bNgecekPythagoras = input.nextInt();
                System.out.print("c: ");
                int cNgecekPythagoras = input.nextInt();
                break;
            case(2):
                System.out.print("a: ");
                int aSisiMiring = input.nextInt();
                System.out.print("b: ");
                int bSisiMiring = input.nextInt();
                
                sisiMiringSegitiga = Math.sqrt((Math.pow(aSisiMiring, 2) + (Math.pow(bSisiMiring, 2))));
                System.out.println("sisi miring segitiga tersebut yaitu" + sisiMiringSegitiga);
                break;
                
            case(3):
                System.out.print("a: ");
                int aAlasSegitiga = input.nextInt();
                System.out.print("c: ");
                int cAlasSegitiga = input.nextInt();
                
                sikuSiku = Math.sqrt((Math.pow(cAlasSegitiga, 2) + (Math.pow(aAlasSegitiga, 2))));
                System.out.println("sisi siku-siku segitiga tersebut adaalah " + sikuSiku);
                break;
            case(4):
                System.exit(0);
                
            default:
                System.out.println("Sorry");
                            
        }
    }
    
}
