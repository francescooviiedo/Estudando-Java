package fundamentos;

public class DesafioCalculadora {
    public static void main(String[] args) {
        double a = 6 * (3 + 2);
        double b = Math.pow(a, 2);
        double c = b / (3 * 2);
        double d = (1 - c) * 3;
        double e = Math.pow(d, 3);
        double f = e / Math.pow(10, 3);
        System.out.println(f);

    }
}
