// LeetCode Question: 1672. Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/description/

public class QuesMaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };

        System.out.println(maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for(int[] person : accounts) {
            int sum = 0;
            for(int amount : person){
                sum += amount;
            }
            if(sum > maxWealth) {
                maxWealth = sum;
            }
        }
        return maxWealth;
    }
}