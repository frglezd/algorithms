import java.util.*;

class betterBruteForcePolynomialEvaluation{

	public static double brutePolynomial(double P[], double x){
	
		double p = P[0];
		double power = 1;
		
		for(int i = 1; i <= P.length-1; i++){
			power = power * x;
			p = p + P[i] * power;		
		} 
		return p;	
	}
	
	public static void main(String[] args){
		double[] A = {1,2};
		double x = 10;
		System.out.println(" " + brutePolynomial(A, x));	
	}
}
