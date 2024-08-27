package fundamentos;
import java.util.Scanner;

public class desafioConversao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double total = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Digite o " + i + "º salário: ");
            total += Double.parseDouble(input.nextLine());
        }
        System.out.println("A média dos salários é " + (total / 3));
    }
}