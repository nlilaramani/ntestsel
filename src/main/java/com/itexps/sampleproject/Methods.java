/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.itexps.sampleproject;

/**
 *
 * @author itexps
 */
public class Methods {
    
    // Define new function
    public static int add(int n1,int n2){
        return n1+n2;
    }
    
   public static int add(int numbers[]){
       int sum=0;
        for(int i=0;i<numbers.length;i++){
            sum=sum+numbers[i];
        }
        return sum;
    }
    public static int sum(int start,int end){
        int s=0;
        for(int i=start;i<=end;i++){
            s=s+i;
        }
        return s;
    }

    public static String greeting(String name){
        return "Good Morning,"+name;
    }
    
    public static int max(int x, int y){
        if(x>y){
            return x;
        }else{
            return y;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers={23,45,67,90,103,43};
        int res=add(numbers);
        int result=add(100,53); // Call the function and store the result
      
        result=max(10,20);
        System.out.println("MAx:"+result);
        result=add(400,56);
        System.out.println("Result:"+result);
        result=sum(1,100);
        System.out.println("Sum:"+result);
        result=sum(100,500);
        System.out.println("Sum:"+result);
        String g=greeting("Naren");
        System.out.println(g);
        
        int s=0;
        for(int i=1;i<=100;i++){
            s=s-i;
        }
        System.out.println("Sum:"+s);
        
        
        
        //int s=0;
        for(int i=100;i<=500;i++){
            s=s+i;
        }
        System.out.println("Sum:"+s);
    }
    
}
