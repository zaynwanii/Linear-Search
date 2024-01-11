//https://leetcode.com/problems/richest-customer-wealth/description/
/*You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
Example 1:

Input: accounts = [[1,2,3],[3,2,1]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.*/

package com.zaid;

public class RichestCustomerWealth {
    public static void main(String[] args) {
        int wealth=Integer.MIN_VALUE;
        int  sum=0;
        int [][] accounts={
                {1,5},
                {3,7},
                {3,5},
                {4,5,6},
                {1,1,1,1,1}
        };

        for (int rows = 0; rows < accounts.length; rows++) {
            sum=0;
            for (int cols = 0; cols < accounts[rows].length; cols++) {
                sum+=accounts[rows][cols];
            }
            if(sum>wealth)
            {
                wealth=sum;
            }

        }

        System.out.println(wealth);

        }

    }

