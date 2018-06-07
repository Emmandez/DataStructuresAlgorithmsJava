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
public class bubbleSort {
    public static void main(String[] args){
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};
        
//        for(int i = 0; i<intArray.length; i++){
//            System.out.print(intArray[i]+" ");
//        }    
//        
        
        
        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex>0; lastUnsortedIndex--){
            for(int i = 0; i<lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i+1]){
                    swap(intArray, i, i+1);
                }
                System.out.println("\n");
                for(int j = 0; j<intArray.length; j++){
                    System.out.print(intArray[j]+" ");
                }
            }
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
