public class SphereVolume implements ISubscriber {
    @Override
    public void notifySubscriber(String input) {
        Double radius = Double.parseDouble(input);
        System.out.println("Sphere Volume = " + calcVolume(radius));
    }

    private Double calcVolume(Double radius) {
        Double PI = 3.14159265;
        return (4.0/3.0) * PI * radius * radius * radius;
    }
}
