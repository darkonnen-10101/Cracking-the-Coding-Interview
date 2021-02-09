package crackingthecode.excercises.leetcode;

public class RichestCostumerWealth {

	public int maximumWealth(int[][] accounts) {
		
		int sum = 0;
		int max = 0;

		for (int i = 0; i < accounts.length; i++) {
			
			sum = 0;
			
			for (int j = 0; j < accounts[i].length; j++) {
				sum += accounts[i][j];
			}
			
			if(sum > max) {
				max = sum;
			}

		}

		return max;

	}

	public static void main(String[] args) {

		RichestCostumerWealth r = new RichestCostumerWealth();
//    	int[][] numbers = {{1,2,3},{3,2,1}};
//		int[][] numbers = { { 1, 5 }, { 7, 3 }, { 3, 5 } };
//    	int[][] numbers = {{2,8,7},{7,1,3},{1,9,5}};
		int[][] numbers = {{6,59,64,19,30,76,71,86,90,25,56,17,19,72,61,56,24,40,35,39,67,28,52,11,82,72,8,82,81,47}};

		System.out.println(r.maximumWealth(numbers));

	}
	
	// Fucking O(N2)

}
