package Week1;

public class FinancialForecast {
	public static void main(String[] args) {
		double presentVal=1000;
		double rate=0.10;
		int years=2;
		double predFuture=presentVal * power(1+rate,years);
		System.out.printf("Future Value after %d years = ₹%.2f%n", years, predFuture);
	}
	public static double power(double base,int exp) {
		if(exp==0) {
			return 1d;
		}
		double half=power(base,exp/2);
		if(exp%2==1) {
			return half*half*base;
		}
		else {
			return half*half;
		}
	}
}
