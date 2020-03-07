# git_assignment_initial
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twopwrn;

import java.util.Scanner;

/**
 *
 * @author Ma 7m Ou D
 */
public class TwoPwrN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        int result=1;
        for(int i=0;i<num;i++){
            result*=2;
        }
        System.out.print("2 power "+num+" is equal : "+result);
    }
    
}
