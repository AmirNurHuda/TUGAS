/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author Benjamin
 */
public class upahkerja {
    public static void main(String[] args) {
    System.out.println("Upah Kerja Per Jam Rp.2.500 ");
    System.out.println("Pajak 15% ");
     int upah, qty, hasil;
     double grandtotal, pajak;
     
     Scanner inputjumlah = new Scanner(System.in);

     System.out.print("Input Jumlah Jam Kerja :");
     qty = inputjumlah.nextInt();
     
     upah=2500;
     hasil = upah * qty;
     pajak = hasil * 0.15;
     grandtotal=hasil-pajak;
             
     System.out.println("Jumlah Jam Kerja  = " + qty + " Jam");
     System.out.println("Pajak  = " + pajak );
     System.out.println("Total  = " + hasil);
     System.out.println("Grandtotal   = " + grandtotal);
    
    
    
    
    }
    
}
