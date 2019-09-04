package geeksforgeeks;
public class UglyNumbers {
	// ugly numbers are those numbers whose prime factors are 2,3 or 5 ( 1 is considered as an ugly number by default)
	
	
	public  static int getuglynumber(int number) {
		int ugly[] = new int[number]; // result array to store ugly numbers;
		ugly[0]=1; // starting value is 1 considered
		int i2,i3,i5; //  index for 2,3,5 sub-sequence;
		i2=i3=i5=0; //  starting index for 2,3,5 sub-sequence;
		int next_multiple_of_2 = 2;// this variable will store the next multiple or subvalue for prime number 2;
		int next_multiple_of_3 = 3;// this variable will store the next multiple or subvalue for prime number 3;
		int next_multiple_of_5 = 5;// this variable will store the next multiple or subvalue for prime number 5;
		
		int next_ugly_number = 1;
		
		for(int i =1; i < number; i++) {
			next_ugly_number = Math.min(next_multiple_of_2, Math.min(next_multiple_of_3, next_multiple_of_5));
			
			ugly[i] = next_ugly_number;
			if(next_ugly_number == next_multiple_of_2) {
				i2 = i2+1;
				next_multiple_of_2 = ugly[i2]*2;
			}
			if(next_ugly_number == next_multiple_of_3) {
				i3 = i3+1;
				next_multiple_of_3 =  ugly[i3]*3;
			}
			if(next_ugly_number == next_multiple_of_5) {
				i5 = i5+1;
				next_multiple_of_5 =  ugly[i5]*5;
			}
			
		}
		
		return next_ugly_number;
	}
	
	public static void main(String[] args) {
		int n = 150;
		System.out.println(getuglynumber(n));
	}
}
