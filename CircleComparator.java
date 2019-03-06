package Shape;

public class CircleComparator implements Comparator <Cirle> {
    @Override
    public Boolean compare(Cirle crl1 , Cirle crl2) {
        if (crl1.getArea() >= crl2.getArea()) {
            return true;
        }else {
            return false;
        }
    }

}
