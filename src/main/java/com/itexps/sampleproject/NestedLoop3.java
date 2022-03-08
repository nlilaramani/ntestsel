/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class NestedLoop3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i=1;
        while(i<=5){
            for(int j=1;j<=5;j++){
                int m=i*j;
                System.out.print(m);
                if(m>=10){
                    System.out.print(" ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
            i++;
        }
    }
    
}
