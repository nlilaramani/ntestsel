/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

import java.util.Scanner;

/**
 *
 * @author itexps
 */
public class MPGInput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Use scanner object for user input
        Scanner sc=new Scanner(System.in);
        //sc.nextLine();
        System.out.print("Enter miles driven:");
        // Read miles value fromk keyboard
        int miles=sc.nextInt();
        //System.out.print("Enter gallons of gas used:");
        double gallons=sc.nextDouble();
        
        double mpg=miles/gallons;
        
        System.out.println("MPG is:"+mpg);
        
        
    }
    
}
