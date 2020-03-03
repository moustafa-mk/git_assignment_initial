public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        Double radius = Double.parseDouble(input);
        System.out.println((4/3) * Math.PI * Math.pow(radius, 3));
    }
}
