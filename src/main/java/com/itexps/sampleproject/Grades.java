/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class Grades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int score=82;
        double grade=0.0;
        if(score<60){
            grade=0.0;
        }else if(score<=62){
            grade=0.7;
        }else if(score<=95){
            grade=(score-63)*0.1+0.8;
        }else{
            grade=4.0;
        }
        System.out.println("Grade:"+grade);
    }
    
}
