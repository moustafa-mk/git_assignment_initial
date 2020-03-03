public class CircleArea implements ISubscriber{

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		double pi = 3.14, area;
		double r= Double.parseDouble(input);
		area = pi * r * r;
		System. out. println("Area of circle:"+area);
		
	}
}
