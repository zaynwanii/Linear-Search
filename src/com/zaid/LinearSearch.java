package com.zaid;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={14,18,16,32};
        int findElem;
        System.out.println("Enter element to be searched:");
        findElem= sc.nextInt();

       int index= linearSearch(arr,findElem);

       if(index!=-1){
           System.out.println(findElem+" found at index: "+index);
       }
       else{
           System.out.println("Element not found!");
       }

    }
   static int linearSearch(int []arr,int findELem){
       for (int i = 0; i < arr.length; i++) {
           if(arr[i]==findELem)
           {
               return i;

           }
       }
       return -1;
    }
}
