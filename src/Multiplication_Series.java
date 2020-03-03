public class Multiplication_Series implements ISubscriber {
    public static int Factorize(int multiplicationInput){
        if ( multiplicationInput == 0){
            return 1;}

        else return (multiplicationInput * Factorize(multiplicationInput - 1));
    }


    @Override
    public void notifySubscriber(String input) {
        System.out.println("Multiplication Series = " + Factorize(Integer.parseInt(input)));
    }
}
