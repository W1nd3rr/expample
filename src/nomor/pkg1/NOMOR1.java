    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor.pkg1;

import java.util.Scanner;

/**
 *
 * @author Pavilion
 */
public class NOMOR1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // n lebih besar dari 2
        int on;
        Scanner input = new Scanner(System.in);
        System.out.println("menentukan saklar akan on atau off");
        System.out.println("abang pilih 0 atau 1");
        on = input.nextInt();
        if (on==1) {
            System.out.println("on");
        } else { 
            System.out.println("off");
        }
    }
}
