package excelJava;

public class excelJava {
	public double SUM(double[] args){
		double sum;
		sum = 0;
		for (int i=0; i < args.lenght; i ++)
			sum = sum + args[i];
		return sum;
	}
	
	public double PRODUCT(double[] args){
		double product;
		product = 1;
		for (int i=0; i < args.lenght; i ++)
			product = product * args[i];
		return product;
	}
	
	public double DIVIDE(double dividend, double divisor){
		//Excel does not provide a divide function but in Java, especially for begginers, getting a precise division can be a challenge
		// if there is a need to transform a int into a double simply pu t (double) before the value or variable
		double quotient;
		quotient = dividend / divisor; // the division operator "/" works here because a double/double is forced, a int/double would be imprecise
		return quotient;
	}
	
	public double POWER(double base, double exponent){
		double result;
		if (exponent == 0) {
		    return (double)1;
		}
		if (exponent == 1) {
		    return base;
		}
		result = base * base;
		for (int i=2; i < exponent; i ++)
			result = result * base;
		return result;
	}
	
	public double MED(double[] args){
		Arrays.sort(args);
		double median;
		if (args.length % 2 == 0)
			median = ((double)args[args.length/2] + (double)args[args.length/2 - 1])/2;
		else
			median = (double) args[args.length/2];
		return median;
	}
  
}
