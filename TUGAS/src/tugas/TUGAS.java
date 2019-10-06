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
public class TUGAS {

    public static void main(String[] args) {
        System.out.println("Harga 1 Printer Rp.660.000 ");
        int harga, qty, hasil;
        double diskon , grandtotal;

        Scanner inputjumlah = new Scanner(System.in);

        System.out.print("Input Jumlah Barang :");
        qty = inputjumlah.nextInt();

        harga = 660000;
        hasil = harga * qty;
     
        
        if (hasil>1500000){
            diskon=hasil*0.15;
       

                }
        else {        
             diskon=0;
   

        }
        grandtotal=hasil-diskon;
        System.out.println("Diskon  = " + diskon);
        System.out.println("Jumlah  = " + qty);
        System.out.println("Total   = " + hasil);
        System.out.println("Grandtotal   = " + grandtotal);
            }

}
