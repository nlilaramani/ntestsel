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
public class IfElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num=-50;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("Number is positive");
        }
        System.out.println("GoodBye");
    }
    
}
