/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion;

/**
 *
 * @author eherd
 */
public class factorial {
    public static void main(String[] args){
        System.out.println(recursiveFactorial(5));
    }
    
    
//    1! = 1*0! = 1
//    2! = 2*1 = 2*1!
//    3! = 3*2*1 = 3*2!
//    4! = 4*3*2*1 = 4*3!
//    5! = 5*4*3*2*1 = 5*4!
    
//    n! = (n-1)!*n
    
    public static int iterativeFactorial(int num){
        if(num==0) return 1;
        
        int factorial =1;
        
        for(int i = 1; i<=num; i++){
            factorial *= i;
        }
        
        return factorial;
    }
    
    //Example when num = 3
    //recursiveFactorial(0) = 1
    //recursiveFactorial(1) = 1
    //recursiveFactorial(2) = 2
    //recursiveFactorial(3) = 3
    public static int recursiveFactorial(int num){
        if(num==0) return 1;
        
        return num * recursiveFactorial(num-1); 
    }
    
}
