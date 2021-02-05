package crackingthecode.excercises.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

public class RunningSumOf1dArray {
	
    public int[] runningSum(int[] nums) {
        
        int sum = 0;
        int[] otherNums = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            otherNums[i] = sum;
        }
        
        return otherNums;
    }

    public static void main(String[] args) {
    	
    	RunningSumOf1dArray sum = new RunningSumOf1dArray();
    	
    	int[] result = sum.runningSum(IntStream.of(1, 2, 3, 4).toArray());
    	
    	System.out.println(Arrays.toString(result));
    	
    }

}
