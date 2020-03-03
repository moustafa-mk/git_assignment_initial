public class CircleCircumference implements ISubscriber {
    @java.lang.Override
    public void notifySubscriber(String input) {
        double r = Double.parseDouble(input.replaceAll("\\s", ""));
        System.out.println("Circle Circumference : " + this.CalcCircumference(r));
    }

    private double CalcCircumference(double r){
        return 2 * Math.PI * r;
    }
}
