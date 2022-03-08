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
public class WorkerSalary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hourlyRate; // no value
        int hoursWorked;
        Scanner sc=new Scanner(System.in);
        hourlyRate=sc.nextInt(); //40
        System.out.println("Hourly rate is:"+hourlyRate);
        hoursWorked=sc.nextInt();
        //int total=hourlyRate*hoursWorked;
        //System.out.println("Total Salary is:"+total);
        hourlyRate=100;
        int total=hourlyRate*hoursWorked;
        System.out.println("Total Salary is:"+total);
        int a=10;
        a=20;
        System.out.println(a);
        a=20+30;
        System.out.println(a);
       
    }
    
}
