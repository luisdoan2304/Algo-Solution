package algo_solution;

public class Solution {

	public int solution(int[] A) {
		int evenSum = 0;
		int oddSum = 0;

		for (int i = 0; i < A.length; i++) {
			if (i % 2 == 0) {
				evenSum += A[i];
			} else {
				oddSum += A[i];
			}
		}

		int maxS = evenSum - oddSum;
		int modulo = 1_000_000_000;
		int result = maxS % modulo;

		if (result < 0) {
			result += modulo;
		}

		return result;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();

		int[] A1 = { 2, 4, 1, 6, 5 };
		int maxS1 = solution.solution(A1);
		System.out.println("Maximum value of S: " + maxS1);

		int[] A2 = { 3, 1, 5 };
		int maxS2 = solution.solution(A2);
		System.out.println("Maximum value of S: " + maxS2);

		int[] A3 = { 1_000_000_000, 1, 1_000_000_000 };
		int maxS3 = solution.solution(A3);
		System.out.println("Maximum value of S: " + maxS3);
	}
}
