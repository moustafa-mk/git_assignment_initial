import java.util.Scanner;

public class CircleArea {

	public double CalculateArea(double r)
	{
		
		double pi = 3.14, area;
		Scanner s = new Scanner(System.in);
		
		r = s.nextDouble();
		area = pi * r * r;
		//System. out. println("Area of circle:"+area);
		return area;
	}
}
