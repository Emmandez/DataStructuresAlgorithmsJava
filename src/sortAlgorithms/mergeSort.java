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
public class mergeSort {
    public static void main(String[] args){
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        for(int i :array){
            System.out.print(i+" ");
        }
        
        mergeSort(array, 0, array.length);
        
        System.out.println("\n");
        
        for(int i :array){
            System.out.print(i+" ");
        }
        
       
        
    }
//    {20, 35, -15, 7, 55, 1, -22}
    public static void mergeSort(int[] input, int start, int end){
        if(end - start < 2) return;
        
        int mid = (start + end) / 2;
        
        //Left Array
        mergeSort(input, start, mid);
        //Right Array
        mergeSort(input, mid, end);
        
        merge(input, start,mid,end);
        
    }
//    {20, 35, -15, 7, 55, 1, -22}    
    public static void merge(int[] input, int start, int mid, int end){
        
        //As we are merging sorted arrays, if this condition is true
        // it means that the input is already sorted
        if(input[mid - 1] <= input[mid]) return;
        
        int i = start;
        int j = mid;
        int tempIndex = 0;
        
        int[] temp = new int[end-start];
        
        //iterating through left (i) and right(j) arrays
        while(i<mid && j<end){
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }
        
        System.arraycopy(input, i, input, start+tempIndex, mid-i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
    
}
