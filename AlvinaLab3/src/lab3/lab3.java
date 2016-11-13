package lab3;

import java.lang.Math;

public class lab3 implements var01 {
	
	public double logika(double d1, double d2, double d3){
		double res = d1<d2?(d2<d3?d3-d1:(d1<d3?d2-d1:d2-d3)):(d1<d3?d3-d2:(d2<d3?d1-d2:d1-d3));
		return res;
		}
	
	 public void poka(double N){
		 double count = (N/3)+1;
		 double res = Math.floor(count);
		 System.out.println("Ответ  " + res);
		}
	 
	 public void massivy(double[] A, double T){
		 double res = 0;
		 
		 for(int j=0; j < T; j++){
			 if(A[j]<T){
				 res = A[j];
				 System.out.println("Ответ " + A[j]);
				 return;
			 }
		 }
		 System.out.println("Ответ - " + res);
	 }

}
