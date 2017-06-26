
public class P1 {

	static double fivesqrt = Math.sqrt(5);

	
	static double Fibonacci(int n)
	{
		double f = 0;
		f=(1/fivesqrt)*((Math.pow(((1+fivesqrt)/2), n))-(Math.pow(((1-fivesqrt)/2), n)));
		
		return f;
		
		
	}
	
	
	public static void main(String[] args) {
		
		int n;
		double f;
		
		for(n=0;n<101;n++)
		{
			f=Fibonacci(n);
			System.out.println("n="+n+":"+String.format("%.0f", f)+"   ");
			
		}

	}

}
