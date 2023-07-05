package javaTest.dt;

public class TernaryOperatorDetail {
	
	public static void main(String[] args) {
		
	//int a = 5, b = 5, c = 4; 
	//System.out.println((++a == b)? a:c--);
		//int fact(int numA){ 
		//	if(numA<=0)
		//		return 1;
		//	else 
		//		return numA * fact(numA-1); 
		///}
		//System.out.println(fact(5));
		int i = 10; 
		while ( i > 0 ){ 
			i = i + 1; 
			System.out.println("i1="+i);
			if ( i == 10 ){ 
				System.out.println("i2="+i);
				break; 
			}
		}
	}
}