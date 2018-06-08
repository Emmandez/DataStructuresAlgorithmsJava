/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortAlgorithms;

/**
 *
 * @author eherd
 */
public class shellSort {
    public static void main(String[] args){
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        
        for(int i : array){
            System.out.print(i+" ");
        }
        
//        7, 35, -15, 20, 55, 1, -22
        
        for(int gap = array.length/2; gap > 0; gap/=2){
            
            for(int i=gap; i<array.length; i++){
                int newElement = array[i];
                int j = i;
                
                while(j>=gap && array[j-gap]>newElement){
                    array[j]=array[j-gap];
                    j -=gap;
                }
                array[j] = newElement;
            }   
        }
        
        System.out.println("\n");
        
        for(int i : array){
            System.out.print(i+" ");
        }
        
    }
}
