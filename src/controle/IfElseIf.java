package controle;

public class IfElseIf {
    public static void main(String[] args) {
        double nota = 7.3;
        if (nota >= 9.0) {
            System.out.println("Quadro de honra!");
        } else if (nota >= 7.0) {
            System.out.println("Aprovado.");
        } else if (nota >= 5.0) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
    }
}
