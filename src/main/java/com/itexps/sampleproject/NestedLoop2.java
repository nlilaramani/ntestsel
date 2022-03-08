/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class NestedLoop2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        while(i<=5){
            int j=1;
            while(j<=5){
                if(i*j<10){
                    System.out.print(i*j);
                    System.out.print("  ");
                }else{
                    System.out.print(i*j);
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println("");
            i++;
        }
    }
    
}
