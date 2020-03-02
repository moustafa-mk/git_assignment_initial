
public class fibonacci implements ISubscriber {

	@Override
	public void notifySubscriber(String input) {
		//convert String to number
		int n = Integer.parseInt(input);

		//number of equations
		System.out.println("///////////////////////////////////////////////////////////////////");
		System.out.println("num of fibonacci equations: "+ n);
		int a = 1 ;
		int b = 1 ;
        int c ;
		for(int i = 0 ; i < n ; i++)
		{
			c = a + b ;
			System.out.println("equation no."+ (i+1) +" : "+ a +" + " + b +" = " + c);
			a = b ;
			b = c ;
		}
		System.out.println("///////////////////////////////////////////////////////////////////");

	}
}
