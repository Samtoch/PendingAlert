/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author samuel
 */
public class main {
    public static void main(String[] args) {
        // TODO code application logic here
        int number  = 1;
        int number2 = 11;
        int number3 = 111;

       // String format below will add leading zeros (the %0 syntax) 
       // to the number above. 
       // The length of the formatted string will be 7 characters.

       String formatted = String.format("%03d", number);
       String formatted2 = String.format("%03d", number2);
       String formatted3 = String.format("%03d", number3);
       System.out.println("Number with leading zeros: " + formatted);
       System.out.println("Number with leading zeros: " + formatted2);
       System.out.println("Number with leading zeros: " + formatted3);

    }
}
