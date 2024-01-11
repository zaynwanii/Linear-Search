package com.zaid;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenDigits {
    public static void main(String[] args) {
     int [] nums={123,45,88,12456,1000,20};
        int evenCount=0;

        //Method 1
        for(int elem:nums)
        {
            if(checkEvenDigits(elem))
            {
                evenCount++;
            }
        }
        System.out.println(evenCount);
    }
    static boolean checkEvenDigits(int elem)
    {
        return countDigits(elem)%2==0;
    }
    static int countDigits(int n)
    {
        int digits=0;
        while(n!=0)
        {
            digits++;
            n=n/10;
        }
        return digits;
    }

}

//Method 2
// String n=Integer.toString(elem);
// if(n.length()%2==0)
// {
//     evenCount++;
// }

