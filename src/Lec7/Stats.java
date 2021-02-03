package Lec7;

public class Stats<T extends Number> {
	
	T[] nums;
	
	Stats(T[] ob) {
		nums = ob;
	}
	
	double average() {
		double sum = 0.0;
		
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i].doubleValue();
		}
		
		return sum / nums.length;
	}

}
