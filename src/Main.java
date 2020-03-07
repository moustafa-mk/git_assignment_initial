import java.util.Scanner;

public class Main {
	private static ISubscriber subscribers [] = {
			//new SimpleSubscriber(),
			//new ReallySimpleSubscriber(),
			new Lucas_Series(),
			new fibonacci(),/*20170129*/
			new SphereVolume(),
			new Summation_Series (),
		  new CircleArea(),
			new CircleCircumference(),
      new BallVolume(),
			new Multiplication_Series(),
	};
	public static void main(String[] args) {
		Topic mathTopic = new Topic();
		for (ISubscriber sub : subscribers) {
			mathTopic.addSubscriber(sub);
		}
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		mathTopic.dispatchEvent(input);
	}
}
