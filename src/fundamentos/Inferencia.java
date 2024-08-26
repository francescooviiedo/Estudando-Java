package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        var a = 4.5;
        System.out.println(a);

        var b = "Texto";
        System.out.println(b);

        b = "Outro texto";
        System.out.println(b);

        // b = 4.5; // Error: incompatible types: double cannot be converted to String
    }
}
