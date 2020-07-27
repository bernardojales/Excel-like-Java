package excelJava;

public class excelJava {
	
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
