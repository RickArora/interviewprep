
  public class topThreeInts {
  public static int[] threeHighest(int[] A) {
		int highest = Integer.MIN_VALUE, secondHighest = Integer.MIN_VALUE, thirdHighest = Integer.MIN_VALUE, temp = Integer.MIN_VALUE, temp2 = Integer.MIN_VALUE;
		
		for (int i = 0; i < A.length; i++) {
			if(A[i] > highest) {
				temp = highest;
				highest = A[i];
				if(temp > secondHighest) {
					thirdHighest = secondHighest;
					secondHighest = temp;
				}
				if(temp > thirdHighest && temp < secondHighest) {
					thirdHighest = temp;
				}
			}
			
			else if (A[i] < highest && secondHighest < A[i]) {
				temp2 = secondHighest;
				secondHighest = A[i];
				if (temp2 > thirdHighest) {
					thirdHighest = temp2;
				}
			}
			else if(A[i] < secondHighest && A[i] > thirdHighest) {
				thirdHighest = A[i];
			}
			
		}
		int[] topThree = {highest, secondHighest, thirdHighest};
		
		for (int i: topThree) {
			System.out.println(i);
		}
		
		return topThree;
  }
  }