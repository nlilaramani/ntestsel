/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class Variables1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare
        int n;
        // assigning value to variable
        n=100;
        // declare a variable and initialize the value
        int x=200;
        int y=n+x+10;
        System.out.println(y);
        boolean active=true;
        // String variable
        String name="Bob";
        String hello="Hello";
        // String concatenation
        String result=hello+" "+name;
        System.out.println(result);
        char c='A';
        
        char ch='A'+'B';
        System.out.println(ch);
        
        int ci;
        // assign character to integer
        ci=ch;
        System.out.println(ci);
        ch='C'-2;
        System.out.println(ch);
        
        double d=10+(30/2)+(20*2);
        System.out.println(d);
        
        int var=5;
        boolean b=(var==6);
        System.out.println(b);
        System.out.println(10>6);
        System.out.println(10>=6);
        System.out.println(10<6);
        System.out.println(10<=6);
        System.out.println(10>6);
        System.out.println(10!=6);
    }
    
}
