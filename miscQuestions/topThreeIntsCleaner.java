class topThreeIntsCleaner {
public static int[] threeHighest2(int[] arr) {
		int[] randomArray = {Integer.MIN_VALUE,Integer.MIN_VALUE,Integer.MIN_VALUE};
		for(int i: arr) {
			if(i > randomArray[0]) {
				randomArray[2] = randomArray[1];
				randomArray[1] = randomArray[0];
				randomArray[0] = i;
			}
			else if(i > randomArray[1] && i != randomArray[0]) {
				randomArray[2] = randomArray[1];
				randomArray[1] = i;
			}
			else if(i > randomArray[2] && i != randomArray[0] && i != randomArray[1]) {
				randomArray[2] = i;
			}
		}
		for(int i: randomArray) {
			System.out.println(i);
		}
		
		return randomArray;
  }
}