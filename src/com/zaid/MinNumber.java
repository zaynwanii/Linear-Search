package com.zaid;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr={18,8,-32,4,1,3,2};
        System.out.println("Minimum element: "+findMin(arr));
    }

    static int findMin(int[] arr)
    {
        int min=arr[0];
        for (int elem :arr)
        {
            if(elem<min)
            {
                min=elem;
            }
        }
        return min;
    }

}
