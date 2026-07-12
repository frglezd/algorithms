import java.util.*;

class bruteForcePolynomialEvaluation{

	public static double brutePolynomial(double P[], double x){
	
		double p = 0;
		double power;
		
		for(int i =  P.length; i <= 0; i--){
			power = 1.0;
			for (int j = 1; j < i; j++){
				power = power * x;
			}
			p = p + P[i] * power;		
		} 
		return p;	
	}
	
	public static void main(String[] args){
		double[] A = {1,2,3, 4, 5};
		double x = 10;
		System.out.println(" " + brutePolynomial(A, x));	
	}
}
