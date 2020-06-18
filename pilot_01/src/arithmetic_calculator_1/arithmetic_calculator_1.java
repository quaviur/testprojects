package arithmetic_calculator_1;

import java.util.Scanner;
public class arithmetic_calculator_1 {
	
	public int sum(int a, int b) {
		int c;
		c = a + b;
		System.out.println("a + b = " +c);
		return c;
	}
	
	public float sub(float a, float b) {
		float c;
		c = b - a;
		System.out.println("b - a = "+c);
		return c;
	}
	
	public double mul(double a, double b) {
		double c;
		c = a * b;
		System.out.println("a x b = "+c);
		return c;
	}
	
	public double div(double a, double b) {
		double c;
		c = b / a;
		System.out.println("b / a = "+c);
		return c;
	}
	
	public static void main (String[] args)
	{
		Scanner variables = new Scanner (System.in);
		
		System.out.println("Enter value for a : ");
		int a = variables.nextInt();
		
		System.out.println("Enter value for b : ");
		int b = variables.nextInt();
		
		arithmetic_calculator_1 myCalc = new arithmetic_calculator_1();
		
		myCalc.sum (a,b);
		myCalc.sub (a,b);
		myCalc.mul (a,b);
		myCalc.div (a,b);
		
	}
}
