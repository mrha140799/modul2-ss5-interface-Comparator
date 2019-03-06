package Shape;

public class Main {
    public static void main(String[] args) {
        Cirle[] cirles = new Cirle[2];
        cirles[0] = new Cirle(10);
        cirles[1] = new Cirle(20);
        CircleComparator circleComparator = new CircleComparator();
        if (circleComparator.compare(cirles[0], cirles[1])) {
            System.out.println("Circle index 0 >= circle index 1");
        }else {
            System.out.println("Circle index 0 < circle index 1");

        }
    }
}
