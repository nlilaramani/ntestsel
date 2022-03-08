/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class TrafficSignal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String color="RED";
        
        if(color == "RED"){
            System.out.println("Stop");
        }else if(color=="GREEN"){
            System.out.println("Go!");
        }else if(color=="AMBER"){
            System.out.println("Watch before you go!");
        }
    }
    
}
