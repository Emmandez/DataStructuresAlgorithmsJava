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
public class selectionSort {
    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        
        for(int i = 0; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        } 
        
        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex>0; lastUnsortedIndex-- ){
            int largest = 0;
            
            for(int i =1; i<=lastUnsortedIndex; i++){
                
                if(intArray[i]>intArray[largest]){
                    largest = i;
                }
            }
            
            //Once we know which element is the largest in our unsorted portion, we swap the elements
            swap(intArray, largest, lastUnsortedIndex);
            
        }
        
        System.out.println("\n");
        for(int i = 0; i<intArray.length; i++){
            System.out.print(intArray[i]+" ");
        } 
        
        
        
    }
    
    public static void swap(int[] array, int i, int j){
        if (i==j){
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
