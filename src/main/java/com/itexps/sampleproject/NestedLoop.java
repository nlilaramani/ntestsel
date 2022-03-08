/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int row=1;row<=5;row++){ // 1.i=0,0<=5 i=1 1<=5 2. 
            for(int column=1;column<=5;column++){ //1. j=0,0<=5, j=1, 1<=5 2. 3. j=2
                System.out.print("*"); //1. ***** ****** ****** ******
            }
            System.out.println(""); //1. 
        }
    }
    
}
