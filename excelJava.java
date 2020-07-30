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
