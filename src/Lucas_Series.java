
public class Lucas_Series implements ISubscriber {
	public static int Lucas(int x) {
		switch (x) {
		case 0:
			return 2;
		case 1:
			return 1;
		default:
			return Lucas(x - 1) + Lucas(x - 2);
		}
	}
	
	@Override
	public void notifySubscriber(String input) {
		System.out.println("Lucas Series = " + Lucas(Integer.parseInt(input)));
	}
}
