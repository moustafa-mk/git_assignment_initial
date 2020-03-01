public class Summation_Series implements ISubscriber {

    public static int get_series(int num) {
        int sum = 0;
        for(int i = 0; i <= num; i++) {
            sum = sum + i;
        }
        return sum;
    }

    @Override
    public void notifySubscriber(String input) {
        System.out.println("The summation series of first " + Integer.parseInt(input) + " numbers equals " + get_series(Integer.parseInt(input)));
    }
}
