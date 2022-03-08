/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class CarRental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int age=15;
        double creditLimit=9000.00;
        if(!(age<21) || !(creditLimit<10000)){
            System.out.println("Thumbs up!");
        }else{
            System.out.println("Sorry!");
        }
    }
    
}
