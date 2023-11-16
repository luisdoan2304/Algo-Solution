// Task description:
// You are given an array A of N integers. You can delete some (possibly zero) of its elements. Then the remaining elements in even positions are added and elements in odd positions are subtracted:

// What is the maximum possible value of S that could be obtained by performing such deletions? As the result may be large, return its last nine digits without leading zeros (in other words, return the result modulo 1,000,000,000).
// Write a function:
// class Solution { public int solution(int[] A);}
// that, given an array A of length N, returns the maximum value of S (modulo 1,000,000,000).
// Examples:
// 1. Given], the function should return 6, because we could delete the third value in A and obtain which is the maximum possible value of S.
// 2. Given1,5], the function should return 7, because for A = [3, 1, 5] we could obtain
// 3. Give 1000000000,1,1000000000], the function should return 999999998 because for1000000000,1,1000000000] we could obtain S=1000000000-1+ 1000000000-1-1000000000=2999999998. That is the maximum possible value of S, but it should be returned modulo 1000000000.
// Write an efficient algorithm for the following assumptions:
// ·N is an integer within the range [1..200,000];
// · Each element of array A is an integer within the range [0..1,000,000,000].





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
